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

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}