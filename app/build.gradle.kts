plugins {
    id("project-android-application")
}

android {
    defaultConfig {
        applicationId = "ru.rma.apps.research.project.synchronization"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {

    implementation(project(":mylibrary001"))

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
