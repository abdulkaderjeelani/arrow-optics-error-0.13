val arrowVersion = "0.13.1"
val kotlinVersion: String by project

group = "me.akj"
version = "1.0-SNAPSHOT"

plugins {
    idea
    val kotlinVersion = "1.4.32"
    kotlin("jvm") version kotlinVersion
    kotlin("kapt") version kotlinVersion
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib", kotlinVersion))
    implementation(kotlin("stdlib-jdk7", kotlinVersion))
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
    implementation(kotlin("reflect", kotlinVersion))
    implementation("io.arrow-kt:arrow-core:$arrowVersion")
    implementation("io.arrow-kt:arrow-optics:$arrowVersion")
    implementation("io.arrow-kt:arrow-fx-coroutines:$arrowVersion")
    kapt("io.arrow-kt:arrow-meta:$arrowVersion")
}

application {
    mainClassName = "MainKt"
}