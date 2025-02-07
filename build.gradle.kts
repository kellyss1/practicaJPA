plugins {
    id("java")
    id("io.freefair.lombok") version "8.10.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //Contendedor CDI Weld
    implementation("org.jboss.weld.se:weld-se-core:5.1.3.Final")
    implementation("org.jboss:jandex:3.2.3")

    //JPA
    implementation("org.hibernate:hibernate-core:6.6.4.Final")
    implementation("org.hibernate.orm:hibernate-community-dialects:6.6.4.Final")

    //Base de datos: SQLite
    implementation("org.xerial:sqlite-jdbc:3.47.0.0")

    //Base de datos: PostgreSQL
    implementation("org.postgresql:postgresql:42.7.5")

    //Base de datos: MongoDB
    implementation ("org.mongodb:mongodb-driver-sync:4.9.1")

    //DeltaSpike
    implementation("org.apache.deltaspike.modules:deltaspike-jpa-module-api:2.0.0")
    runtimeOnly("org.apache.deltaspike.modules:deltaspike-jpa-module-impl:2.0.0")

    implementation("org.apache.deltaspike.modules:deltaspike-data-module-api:2.0.0")
    runtimeOnly("org.apache.deltaspike.modules:deltaspike-data-module-impl:2.0.0")


}

sourceSets {
    main {
        output.setResourcesDir(file("${buildDir}/classes/java/main"))
    }
}