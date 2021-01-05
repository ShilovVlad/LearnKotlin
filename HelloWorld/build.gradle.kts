plugins {
    kotlin("jvm") version "1.4.10"
}

group = "org.example"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}
