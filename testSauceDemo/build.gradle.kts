val serenity_version = "4.0.15"
val junit_platform_launcher_version="1.10.0"
val cucumber_junit_platform_engine_version="7.14.0"
val junit_platform_suite_version="1.10.0"
val junit_jupiter_engine_version="5.9.3"
val junit_vintage_engine_version="5.9.3"
val logback_classic_version="1.2.10"
val assertj_core_version="3.23.1"

plugins {
    id("java")
}

group = "org.nttdata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

buildscript {
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:4.0.15")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("net.serenity-bdd:serenity-core:${serenity_version}")
    testImplementation("net.serenity-bdd:serenity-cucumber:${serenity_version}")
    testImplementation("net.serenity-bdd:serenity-screenplay:${serenity_version}")
    testImplementation("net.serenity-bdd:serenity-screenplay-webdriver:${serenity_version}")
    testImplementation("net.serenity-bdd:serenity-ensure:${serenity_version}")
    testImplementation("org.junit.platform:junit-platform-launcher:${junit_platform_launcher_version}")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:${cucumber_junit_platform_engine_version}")
    testImplementation("org.junit.platform:junit-platform-suite:${junit_platform_suite_version}")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${junit_jupiter_engine_version}")
    testImplementation("org.junit.vintage:junit-vintage-engine:${junit_vintage_engine_version}")
    implementation("ch.qos.logback:logback-classic:${logback_classic_version}")
    testImplementation("org.assertj:assertj-core:${assertj_core_version}")
}


tasks.test {
    useJUnitPlatform()
}