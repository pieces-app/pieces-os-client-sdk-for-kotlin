repositories {
    mavenCentral()
    mavenLocal()
}

plugins {
    id("java-library")
    id("maven-publish")
    id("signing")
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
}

kotlin {
    jvmToolchain(19)
    java.withJavadocJar()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
}

/**
 * Upgraded dependencies for strict version control, can also require, prefer, or reject other versions.
 * Can also be configured for versions within a range.
 */
dependencies {
    implementation(files())

    //implementation("org.openapitools:openapi-generator:7.1.0")
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

group = "app.pieces.pieces-os-client"
version = "1.0.0"

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

            defaultArtifacts {
                artifacts {
                    artifact(archives(tasks["kotlinSourcesJar"])) {
                        classifier = "sources"
                    }

                    artifact(tasks["javadocJar"]) {
                        classifier = "javadoc"
                    }
                }
            }

            pom {
                    name.set("Pieces OS Client")
                    description.set("Pieces APIs for functional usage with Pieces OS on your local machine and build your own contextual copilot.")
                    url.set("https://pieces.app/")
                    artifactId = "pieces-os-client"
                    groupId = "app.pieces.pieces-os-client"
                    version = "1.0.0"

                licenses {
                    license {
                        name.set("MIT License")
                        url.set("http://www.opensource.org/licenses/mit-license.php")
                    }
                }
                developers {
                    developer {
                        organization.set("Pieces")
                        organizationUrl.set("https://pieces.app")
                        name.set("Open Source by Pieces (OSP)")
                        email.set("development@pieces.app")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/pieces-app/pieces-os-client-sdk-for-kotlin.git")
                    developerConnection.set("scm:git:ssh://github.com/pieces-app/pieces-os-client-sdk-for-kotlin.git")
                    url.set("https://github.com/pieces-app/pieces-os-client-sdk-for-kotlin/tree/main")
                }
            }
            pom.withXml {
                asNode().appendNode("packaging", "jar")
            }
        }
    }

    repositories {
        maven {
            name = "myRepo"
            url = uri(layout.buildDirectory.dir("C:/Users/jerem/.m2/repository"))
        }
    }

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

    /* in progress, working out signing
    tasks.register<Jar>("MavenPublishingJar") {
        archiveBaseName = "pieces-os-client-1.0.0"
        from("build/libs/")
    }
*/
    signing {
        //sign(tasks.publishToMavenLocal.name)
        //sign(tasks["MavenPublishingJar"])
        useGpgCmd()
        sign(publishing.publications["myLibrary"])
    }

}
