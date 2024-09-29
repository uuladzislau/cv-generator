plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "com.github.uuladzislau"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.itext.kernel)
    implementation(libs.itext.layout)
    implementation(libs.itext.io)

    // Add 'simple' implementation to avoid warnings in console saying
    // failed to load class 'org.slf4j.impl.StaticLoggerBinder'
    implementation(libs.slf4j.simple)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}