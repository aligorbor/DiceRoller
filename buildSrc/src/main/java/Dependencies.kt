import org.gradle.api.JavaVersion

object Config {
    const val application_id = "com.example.diceroller"
    const val compile_sdk = 33
    const val min_sdk = 19
    const val target_sdk = 33
     val java_version = JavaVersion.VERSION_1_8
}

object Releases {
    const val version_code = 1
    const val version_name = "1.0"
}

object KotlinOptions {
    const val jvmTarget = "1.8"
}

object Modules {
    const val app = ":app"
    const val rollDice = ":rollDice"
    const val dice = ":dice"
}

object Versions {
    const val appcompat = "1.4.1"
    const val constraint_layout = "2.1.3"
    const val junit = "4.13.2"
    const val test_ext = "1.1.5"
    const val espresso = "3.4.0"
}

object Libraries {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
}

object AndroidTestLibraries {
    const val test_ext = "androidx.test.ext:junit:${Versions.test_ext}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

object Flavors {
    const val dimension_version = "version"
}

