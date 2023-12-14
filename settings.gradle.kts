pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    plugins {
        kotlin("jvm") version "2.0.0-Beta"
    }
}




//dependencyResolutionManagement {
    //repositories{
        //mavenCentral()
    //}
//}

rootProject.name = "pieces-os-client"

//include("src:main:kotlin:org:piecesapp:client:apis")
//include("src:main:kotlin:org:piecesapp:client:infrastructure")
//include("src:main:kotlin:org:piecesapp:client:models")

/*
// Traversal method to scan directories and add files automatically to the build.
// Functional but disabled for possible future use?
rootDir.listFiles().filter { it.isDirectory && (File(it, "build.gradle.kts").exists()) }.forEach {
    include(it.name)
}*/