package ru.rma.apps.research.project.synchronization.plugins

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Action
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

internal class ProjectAndroidApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) = target.applyPlugin()

    private fun Project.applyPlugin() {
        plugins.run {
            apply("com.android.application")
            apply("org.jetbrains.kotlin.android")
        }
        android {
            compileSdk = 32
            defaultConfig {
                minSdk = 24
                targetSdk = 32
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
            buildTypes {
                release {
                    isMinifyEnabled = false
                    proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                }
            }
            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_11
                targetCompatibility = JavaVersion.VERSION_11
            }
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }

    private fun Project.android(configure: Action<BaseAppModuleExtension>) {
        return extensions.configure("android", configure)
    }

    private fun BaseAppModuleExtension.kotlinOptions(configure: Action<KotlinJvmOptions>) {
        return (this as ExtensionAware).extensions.configure("kotlinOptions", configure)
    }
}
