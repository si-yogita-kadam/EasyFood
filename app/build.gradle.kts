plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.easyfood"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.easyfood"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.4")

    //intuit
    implementation ("com.intuit.sdp:sdp-android:1.0.6")
    implementation ("com.intuit.ssp:ssp-android:1.0.6")

    //gif
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.17")

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
   //gson covertor : json file to kotlin objects
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //glide :catch the image from internet and then put into our imageview
    implementation("com.github.bumptech.glide:glide:4.12.0")

    //videoModel mvvm
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0-rc01")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-rc01")
    implementation ("android.arch.lifecycle:extensions:1.1.0")

}