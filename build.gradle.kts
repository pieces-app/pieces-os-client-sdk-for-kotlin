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

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
}


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


// TODO: is this even necessary for a publish?
application {
    application
}

// TODO: brought back @jordan's publishing setup and kotlinized it, need details on specifics to flesh it out.
// https://docs.gradle.org/current/userguide/publishing_maven.html
publishing {
    publications {
        create<MavenPublication>("myLibrary") {
                from(components["java"])
                withBuildIdentifier()
        }
    }

    repositories {
        maven {
            name = "myRepo"
            url = uri(layout.buildDirectory.dir("repo"))
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
