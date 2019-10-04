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
        implementation("io.ktor:ktor-client-core:1.2.5")

        implementation (kotlin("stdlib-common"))
        implementation ("org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:0.13.0")
    }

    sourceSets["androidMain"].dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib")
        implementation("io.ktor:ktor-client-android:1.2.5")

        implementation(kotlin("stdlib-jdk8"))
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.13.0")
    }

    sourceSets["iosMain"].dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:0.13.0")
        implementation("io.ktor:ktor-client-ios:1.2.5")
        implementation("io.ktor:ktor-client-core-native:1.2.5")
    }
}