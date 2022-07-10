package ru.rma.apps.research.project.synchronization.plugins.settings

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.initialization.resolve.RepositoriesMode

internal class ProjectSettingsPlugin : Plugin<Settings> {

    override fun apply(target: Settings) = target.applyPlugin()

    private fun Settings.applyPlugin() {
        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        }
    }
}
