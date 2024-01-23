/**
 * Needed to use plugins in build.gradle files
 */
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

/**
 * Plugins and toolChainManagement added to enforce jvmtoolchain version
 */
plugins {
    id("org.gradle.toolchains.foojay-resolver") version "0.8.0"
}

toolchainManagement {
    jvm {
        javaRepositories {
            repository("foojay") {
                resolverClass.set(org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java)
            }
        }
    }
}

dependencyResolutionManagement {
    repositories{
        mavenCentral()
    }
}

rootProject.name = "pieces-os-client"