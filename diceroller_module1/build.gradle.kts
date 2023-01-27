plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Config.application_id
    compileSdk = Config.compile_sdk

    defaultConfig {
        applicationId = "com.example.diceroller"
        minSdk = Config.min_sdk
        targetSdk = Config.target_sdk
        versionCode = Releases.version_code
        versionName = Releases.version_name

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Config.java_version
        targetCompatibility = Config.java_version
    }
    kotlinOptions {
        jvmTarget = KotlinOptions.jvmTarget
    }
}

dependencies {
    implementation(Libraries.appcompat)
    implementation(Libraries.constraint_layout)
    testImplementation(TestLibraries.junit)
    androidTestImplementation(AndroidTestLibraries.test_ext)
    androidTestImplementation(AndroidTestLibraries.espresso)
}