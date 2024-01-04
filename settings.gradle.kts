pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}




dependencyResolutionManagement {
    repositories{
        mavenCentral()
    }
}

rootProject.name = "pieces-os-client"

//include("src:main:kotlin:org:piecesapp:client:apis")
//include("src:main:kotlin:org:piecesapp:client:infrastructure")
//include("src:main:kotlin:org:piecesapp:client:models")


//rootDir.listFiles().filter { it.isDirectory && !it.isHidden }.forEach {
    //include(it.name)
//}