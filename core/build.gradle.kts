plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.plcoding.core"
}

//dependencies {
//    implementation(project(Modules.core))
//}