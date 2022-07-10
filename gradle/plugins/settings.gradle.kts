pluginManagement {
    rootProject.name = "plugins"
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    includeBuild("../settings")
}
plugins {
    id("project-settings")
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
