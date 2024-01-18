/**
 * repositories opens access to declare repositories
 * https://docs.gradle.org/current/userguide/declaring_repositories.html#sec:declaring_public_repository
 */
repositories {
    mavenCentral() //must have to retrieve dependencies from mavenCentral
    /**
     * testing directory usually found at c:/users/{username}/.m2/repository on windows
     * https://docs.gradle.org/current/userguide/declaring_repositories.html#sec:case-for-maven-local
     */
    mavenLocal()
}

/**
 * plugins opens access to declare the necessary plugins for publishing
 * https://docs.gradle.org/current/userguide/plugin_reference.html#header
 */
plugins {
    /**
     *  Dokka plugin used to generate javadoc from kotlin files, can generate in javadoc, html, github markdown and jekyll markdown.
     */
    id("org.jetbrains.dokka") version "1.9.10"

    /**
     * https://docs.gradle.org/current/userguide/java_library_plugin.html#header
     * opens access to java-library functions with api exposure(java is similar but doesn't open API access)
     */
    id("java-library") //

    /**
     * https://docs.gradle.org/current/userguide/publishing_maven.html#header
     * opens access to the maven publishing functions
     */
    id("maven-publish")
    /**
     * https://docs.gradle.org/current/userguide/signing_plugin.html#header
     * opens access to signing functions
     */
    id("signing")
    /**
     * allows kotlin to use java jvm toolchains & Kotlin DSL/API
     * https://kotlinlang.org/docs/gradle-configure-project.html
     */
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
    /**
     * runs and generates report of dependency vulnerabilities, which may impact usage/publishing
     * https://owasp.org/www-project-dependency-check/
     * good to run could be disabled for build?
     */
    //id("org.owasp.dependencycheck") version "8.4.2"

}

/**
 * creates javadocJar
 */
tasks.register<Jar>("dokkaJavadocJar").configure {
    dependsOn(tasks.dokkaJavadoc)
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

/**
 * creates publishable kotlinSourcesJar, needed for automaticmanifest control
 */
tasks.register<Jar>("kotlinSources").configure {
    dependsOn(tasks.kotlinSourcesJar)
    from(fileTree("src"))
    archiveClassifier.set("sources")
}

kotlin {
    jvmToolchain(17)
}

// not necessary for purely kotlin builds
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    withJavadocJar()
}

/**
 * Upgraded dependencies for strict version control, can also require, prefer, or reject other versions.
 * Can also be configured for versions within a range.
 * Defining the dependencies here automatically includes them in the build.
 */
dependencies {

    //implementation(files()) //not needed?
    //implementation("org.openapitools:openapi-generator:7.1.0") //not needed?
    implementation("com.squareup.moshi:moshi-kotlin") {
        version {
            strictly("1.9.2")
        }
    }
    implementation("com.squareup.moshi:moshi-adapters") {
        version {
            strictly("1.9.2")
        }
    }
    implementation("com.squareup.okhttp3:okhttp") {
        version {
            strictly("4.2.2")
        }
    }
    testImplementation("io.kotlintest:kotlintest-runner-junit5"){
        version {
            strictly("3.1.0")
        }
    }
}

val localRepo = repositories.mavenLocal().url.path
group = "app.pieces.pieces-os-client"
version = "1.2.2"

/**
 * adds automatic generation of manifest entries from files
 */
tasks.withType<Jar>().configureEach {
    manifest.attributes["Main-Class"] = "$group"
    manifest.attributes["Class-Path"] = configurations
        .runtimeClasspath
        .get()
        .joinToString(separator = " ") { file -> "libs/${file.name}" }
    manifest.attributes["API"] = fileTree("src")
        .joinToString(separator = " ") { file -> "${file.name}" }
}


publishing {
    // adds attributes to manifest in generated jar file.  The entries are just for demonstration.
    tasks.jar {
        manifest {
            attributes(
                "Implementation-Title" to "Gradle",
                "Implementation-Version" to archiveVersion,
                "Import-Package" to "com.squareup.okhttp3:okhttp:4.2.2",
                "Require-Capability" to "com.squareup.okhttp;\"version=[4.2.2)\"",
                "Export-Package" to "com.squareup.okhttp;\"version=[4.2.2)\""
            )
        }
    }

    publications {
        create<MavenPublication>("myLibrary") {
            from(components["kotlin"])

            /**
             * builds the sources and javadoc jar files automatically when executing publishing tasks
             */
            defaultArtifacts {
                artifacts {
                    artifact(archives(tasks["kotlinSources"])) {
                        classifier = "sources"
                    }
                    /**
                     * reconfigured to generate kotlin javadoc files properly
                     */
                    artifact(archives(tasks["dokkaJavadocJar"])) {
                        classifier = "javadoc"
                    }

                }
            }

            /**
             * sets the properties of the generated pom file, to include all the sonatype requirements
             */
            pom {
                name.set("Pieces OS Client")
                description.set("Pieces APIs for functional usage with Pieces OS on your local machine and build your own contextual copilot.")
                url.set("https://pieces.app/")
                artifactId = "pieces-os-client"
                groupId = "$group"
                version = version

                /**
                 * licenses
                 */
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("http://www.opensource.org/licenses/mit-license.php")
                    }
                }

                /**
                 * developers
                 */
                developers {
                    developer {
                        organization.set("Pieces")
                        organizationUrl.set("https://pieces.app")
                        name.set("Open Source by Pieces (OSP)")
                        email.set("development@pieces.app")
                    }
                }
                /**
                 * source control management node properties
                 */
                scm {
                    connection.set("scm:git:git://github.com/pieces-app/pieces-os-client-sdk-for-kotlin.git")
                    developerConnection.set("scm:git:ssh://github.com/pieces-app/pieces-os-client-sdk-for-kotlin.git")
                    url.set("https://github.com/pieces-app/pieces-os-client-sdk-for-kotlin/tree/main")
                }
            }
            /**
             * edits the pom after initial creation, adds the packaging node with the value of jar
             */
            pom.withXml {
                asNode().appendNode("packaging", "jar")
            }
        }
    }
    /**
     *
     * sets up direct to maven publishing with signing
     */
    repositories {
        maven {
            name = "OSSRH"
            setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2")
            credentials {
                username = System.getenv("OSSRH_USER") ?: return@credentials
                password = System.getenv("OSSRH_PASSWORD") ?: return@credentials
            }
        }
    }
    /**
     * allows local publication with signing, can be authenticated/tested with kleopatra/gpg to ensure signing is occuring before
     * final publication
     */
    repositories {
        mavenLocal {
            url = uri(layout.buildDirectory.dir("$localRepo"))
        }
    }
    /**
     * generate public/private keys and distribute the public key to pgp.mit.edu this step is required so sonatype
     * can verify the checksums when publishing, without this step the publication will fail
     * https://blog.sonatype.com/2010/01/how-to-generate-pgp-signatures-with-maven/
     */
    signing {
        useGpgCmd() // runs local gpg installation(I used gpg4win/kleopatra to generate keys)
        sign(publishing.publications["myLibrary"]) // the publication being signed
    }
}