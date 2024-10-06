plugins {
    alias(libs.plugins.android.application) // Using the Gradle version catalog for Android plugins
}

android {
    namespace = "com.example.project_googlemaps" // Set the application namespace
    compileSdk = 34 // Specify the compile SDK version

    defaultConfig {
        applicationId = "com.example.project_googlemaps" // Unique ID for your application
        minSdk = 24 // Minimum SDK version
        targetSdk = 34 // Target SDK version
        versionCode = 1 // Version code for the app
        versionName = "1.0" // Version name for the app

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Set test instrumentation runner
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Disable code shrinking for release builds
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro" // Specify ProGuard rules file
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8 // Set source compatibility to Java 8
        targetCompatibility = JavaVersion.VERSION_1_8 // Set target compatibility to Java 8
    }
}

dependencies {
    implementation(libs.appcompat) // AppCompat library for backward compatibility
    implementation(libs.material) // Material Design components
    implementation(libs.activity) // Activity library
    implementation(libs.constraintlayout) // ConstraintLayout for responsive layouts
    implementation(libs.play.services.maps) // Google Maps library
    implementation(libs.play.services.location) // Google Location Services library
    testImplementation(libs.junit) // JUnit for unit testing
    androidTestImplementation(libs.ext.junit) // JUnit Extensions for Android testing
    androidTestImplementation(libs.espresso.core) // Espresso for UI testing
}
