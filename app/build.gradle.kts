plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.valda.music"

    compileSdk = 37

    defaultConfig {
        applicationId = "com.valda.music"

        minSdk = 23
        targetSdk = 37

        versionCode = 1
        versionName = "2.0"
    }

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.17.0")

    implementation("androidx.appcompat:appcompat:1.7.1")

    implementation(
        "androidx.lifecycle:lifecycle-runtime-ktx:2.9.4"
    )

    implementation(
        "androidx.recyclerview:recyclerview:1.4.0"
    )

    implementation(
        "androidx.media3:media3-exoplayer:1.11.1"
    )

    implementation(
        "androidx.media3:media3-session:1.11.1"
    )

    implementation(
        "androidx.media3:media3-ui:1.11.1"
    )

    implementation(
        "io.coil-kt.coil3:coil:3.6.3"
    )

    implementation(
        "io.coil-kt.coil3:coil-network-okhttp:3.6.3"
    )
}
