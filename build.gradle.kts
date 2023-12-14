    repositories {
        mavenCentral()
    }

plugins {
    id("java-library")
    id("maven-publish")
    id("signing")
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
    application
}

// TODO: is this even necessary for a publish?
    application {
        application
    }

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
}

/**
 * Alternate tool chain, noticed it's stock on new kotlin projects, should we be using this instead of the java toolchain, or maybe both?
 */
/*
kotlin {
    jvmToolchain(19)
}*/

/**
 * These are probably only necessary when building the all-inclusive jar, and not for the publishing jar?
 * Classpath is the only one that I'm currently unsure of, looking through how other libraries are formed, they have classpaths and exports in files.
 * Need to figure out if the classpath has to be included here for the needed dependencies to follow, defined elsewhere, or if that happens automatically once published to maven.
 */
dependencies {
    implementation("org.openapitools:openapi-generator:7.1.0")
    //implementation "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi-adapters:1.9.2")
    implementation("com.squareup.okhttp3:okhttp:4.2.2")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.0")
    //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
    //implementation(project("pieces-os-client-sdk-for-kotlin"))
    //implementation("")
    implementation(kotlin("stdlib-jdk8"))
}

group = "org.piecesapp.kotlin"
version = "0.0.1"


/** TODO: brought back @jordan's publishing setup and kotlinized it, need details on specifics to flesh it out.
 * https://docs.gradle.org/current/userguide/publishing_maven.html
 * Overall publishing: publications is the setup for publishing directly to maven, repositories is to publish locally.
 * To execute the publication I click the Gradle elephant on the right side of intellij, go to publishing,
 * I pretty much just ran everything and haven't identified the full purpose of each publishing task.
 */
publishing {
    publications {
        create<MavenPublication>("myLibrary") {
                from(components["java"])
                withBuildIdentifier()
        }
    }

    repositories {
        maven {
            name = "myRepo" //indeed it is
            url = uri(layout.buildDirectory.dir("C:/Users/jerem/.m2/repository")) //replace with your local repository uri
        }
    }
}






// TODO: want to get these tests back in here but for now i removed them due to some versioning issues.
// TODO: @kuba we will have to talk about the details here and if this can actually be skipped.
//test {
//    useJUnitPlatform()
//}
//
//dependencies {
//    // 1.9.21 <-- most recent version
//    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
//    // 1.9.21 <-- most recent version

//}
