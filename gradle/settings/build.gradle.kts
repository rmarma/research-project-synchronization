plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("ProjectSettingsPlugin") {
            id = "project-settings"
            implementationClass = "ru.rma.apps.research.project.synchronization.plugins.settings.ProjectSettingsPlugin"
            displayName = "Project Settings Plugin"
        }
    }
}
