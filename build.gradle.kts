plugins {
    id("io.freefair.lombok") version "8.3"
    id("com.diffplug.spotless") version "6.19.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.slf4j:slf4j-api:PRO")
    implementation("ch.qos.logback:logback-classic:PRO")
    implementation("org.springframework.boot:spring-boot-starter-web:PRO")
    implementation("org.springframework:spring-core:PRO")
    implementation("org.springframework:spring-beans:PRO")
    implementation("org.springframework:spring-context:PRO")
    implementation("org.springframework:spring-expression:PRO")

    testImplementation("org.springframework.boot:spring-boot-starter-test:PRO")
    testImplementation("org.junit.jupiter:junit-jupiter:PRO")
    testImplementation("org.junit-pioneer:junit-pioneer:PRO")
    testImplementation("org.assertj:assertj-core:PRO")
    testImplementation("org.mockito:mockito-core:PRO")
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