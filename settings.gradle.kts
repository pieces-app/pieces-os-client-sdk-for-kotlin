pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.9.21"  //this ended up as 2.0.?_beta before I normalized it to the version in build gradle
    }
}

rootProject.name = "pieces-os-client"


/*
// Traversal method to scan directories and add files automatically to the build.
// Functional but disabled for possible future use?
rootDir.listFiles().filter { it.isDirectory && (File(it, "build.gradle.kts").exists()) }.forEach {
    include(it.name)
}*/


//dependencyResolutionManagement {
    //repositories{
        //mavenCentral()
    //}
//}



//include("src:main:kotlin:org:piecesapp:client:apis")
//include("src:main:kotlin:org:piecesapp:client:infrastructure")
//include("src:main:kotlin:org:piecesapp:client:models")

