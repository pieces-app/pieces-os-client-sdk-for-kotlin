import org.jetbrains.kotlin.ir.backend.js.getModuleDescriptorByLibrary

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
    jvmToolchain(17)
    sourceSets.all {
        languageSettings {
            languageVersion = "1.8"
        }
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

    // TODO: upgrade deps to follow this syntax for a range of versions and preferences
//    dependencyResolutionManagement {
//        versionCatalogs {
//            create("libs") {
//                library("groovy-core", "org.codehaus.groovy:groovy:3.0.5")
//                library("groovy-json", "org.codehaus.groovy:groovy-json:3.0.5")
//                library("groovy-nio", "org.codehaus.groovy:groovy-nio:3.0.5")
//                library("commons-lang3", "org.apache.commons", "commons-lang3").version {
//                    strictly("[3.8, 4.0[")
//                    prefer("3.9")
//                }
//            }
//        }
//    }

dependencies {

    //implementation("org.openapitools:openapi-generator:7.1.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.okhttp3:okhttp:4.2.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.0")
}

group = "app.pieces.pieces-os-client"
version = "1.2.2"

publishing {
    // adds attributes to manifest in generated jar file.  The entries are just for demonstration.
    tasks.jar {
        manifest {
            attributes(
                "Implementation-Title" to "Gradle",
                "Implementation-Version" to archiveVersion,
                "Import-Package" to "com.squareup.okhttp3:okhttp:4.12.0",
                "Require-Capability" to "com.squareup.okhttp;\"version=[4.12.0)\"",
                "Export-Package" to "com.squareup.okhttp;\"version=[4.12.0)\""
            )
        }
    }

    publications {
        create<MavenPublication>("myLibrary") {
            from(components["kotlin"])
            withBuildIdentifier()

            pom {
                name.set("Pieces OS Client")
                description.set("Pieces APIs for functional usage with Pieces OS on your local machine and build your own contextual copilot.")
                url.set("https://pieces.app/")
                artifactId = "pieces-os-client"
                groupId = "app.pieces.pieces-os-client"
                version = "1.2.2"
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
        }
    }

    repositories {
        maven {
            name = "myRepo"
            url = uri(layout.buildDirectory.dir("C:/Users/jorda/.m2/repository"))
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
}
