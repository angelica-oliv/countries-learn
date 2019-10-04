import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

apply(plugin = "kotlinx-serialization")
plugins {
    kotlin("multiplatform")
}

kotlin {
    //select iOS target platform depending on the Xcode environment variables
    val iOSTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iOSTarget("ios") {
        binaries {
            framework {
                baseName = "sharednetwork"
            }
        }
    }

    jvm("android")

    sourceSets["commonMain"].dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
        implementation("io.ktor:ktor-client-core:1.0.1")

        implementation (kotlin("stdlib-common"))
        implementation ("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:0.13.0")
    }

    sourceSets["androidMain"].dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib")
        api("io.ktor:ktor-client-android:1.0.1")

        implementation(kotlin("stdlib-jdk8"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.13.0")
    }
}