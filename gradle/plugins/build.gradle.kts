plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.android.tools.build:gradle:7.2.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}

gradlePlugin {
    plugins {
        create("ProjectAndroidApplicationPlugin") {
            id = "project-android-application"
            implementationClass = "ru.rma.apps.research.project.synchronization.plugins.ProjectAndroidApplicationPlugin"
            displayName = "Project Android Application Plugin"
        }
        create("ProjectAndroidLibraryPlugin") {
            id = "project-android-library"
            implementationClass = "ru.rma.apps.research.project.synchronization.plugins.ProjectAndroidLibraryPlugin"
            displayName = "Project Android Library Plugin"
        }
    }
}
