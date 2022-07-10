// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("project-android-application") apply false
    id("project-android-library") apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
