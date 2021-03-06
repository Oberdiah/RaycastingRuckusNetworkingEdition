buildscript {
    repositories {
        jcenter()
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.2")
    }
}

plugins {
    kotlin("multiplatform") version "1.4.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "9.2.1" apply false
    id("com.gradle.plugin-publish") version "0.12.0" apply false
    kotlin("plugin.serialization") version "1.4.10" apply false
}

allprojects {
    repositories {
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
        google()
    }
}

tasks.register<GradleBuild>("runBoth") {
    dependsOn("backend:run")
    dependsOn("frontend:react:run")
}