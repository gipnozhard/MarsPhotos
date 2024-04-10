@file:Suppress("DEPRECATION")

plugins {
    id("com.android.application") version "8.3.1" apply false
    id("com.android.library") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
