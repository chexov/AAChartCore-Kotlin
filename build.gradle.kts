buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
    }
}

plugins {
    id("maven-publish")
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

tasks.withType<Javadoc> {
    options {
        this as StandardJavadocDocletOptions
        addStringOption("Xdoclint:none", "-quiet")
        addStringOption("encoding", "UTF-8")
    }
}

//For Groovy build.gradle files
project.extra.apply {
    set("minSdkVersion", 33)
    set("targetSdkVersion", 33)
    set("compileSdkVersion", 33)
    set("buildToolsVersion", "30.0.2")
}
