plugins {
    id("io.freefair.lombok") version "8.10"
    id("com.diffplug.spotless") version "6.25.0"
    java
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("ch.qos.logback:logback-classic:1.5.8")
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.16")
    implementation("org.springframework:spring-core:5.3.30")
    implementation("org.springframework:spring-beans:5.3.30")
    implementation("org.springframework:spring-context:5.3.30")
    implementation("org.springframework:spring-expression:5.3.30")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.16")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testImplementation("org.junit-pioneer:junit-pioneer:2.1.0")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.mockito:mockito-core:4.5.1")
}

tasks.test {
    useJUnitPlatform()
}

spotless {
    java {
        removeUnusedImports()
        cleanthat()
        eclipse()
    }
}