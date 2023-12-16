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

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
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

    // old >
    //implementation("org.openapitools:openapi-generator:7.1.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.okhttp3:okhttp:4.2.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.0")

//    implementation("com.squareup.okhttp3:okhttp:4.2.2")
//    constraints {
//        implementation("org.openapitools:openapi-generator:7.1.0") {
//            because("we define specific versions to support efficient usage of our lib.")
//        }
//        implementation("com.squareup.moshi:moshi-kotlin:1.9.2") {
//            because("we define specific versions to support efficient usage of our lib.")
//        }
//
//        implementation("com.squareup.moshi:moshi-adapters:1.9.2") {
//            because("we define specific versions to support efficient usage of our lib.")
//        }
//
//        implementation("com.squareup.okhttp3:okhttp:4.2.2") {
//            because("we define specific versions to support efficient usage of our lib.")
//        }
//
//        implementation("io.kotlintest:kotlintest-runner-junit5:3.1.0") {
//            because("we define specific versions to support efficient usage of our lib.")
//        }
//    }
}

group = "org.piecesapp.kotlin"
version = "0.0.1"

publishing {
    publications {
        create<MavenPublication>("myLibrary") {
           from(components["kotlin"])
            withBuildIdentifier()
        }
    }

    repositories {
        maven {
            name = "myRepo"
            url = uri(layout.buildDirectory.dir("C:/Users/jerem/.m2/repository"))
        }
    }
}
