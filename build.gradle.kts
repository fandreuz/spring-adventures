plugins {
    id("io.freefair.lombok") version "8.0.1"
    id("com.diffplug.spotless") version "6.19.0"
}

dependencies {
    implementation("org.slf4j:slf4j-api:PRO")
    implementation("ch.qos.logback:logback-classic:PRO")
    implementation("org.springframework.boot:spring-boot-starter-web:PRO")

    testImplementation("org.springframework.boot:spring-boot-starter-test:PRO")
    api("org.junit.jupiter:junit-jupiter:PRO")
    api("org.junit-pioneer:junit-pioneer:PRO")
    api("org.assertj:assertj-core:PRO")
    api("org.mockito:mockito-core:PRO")
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