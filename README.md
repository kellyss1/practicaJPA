# 🏪 Proyecto de Gestión de Productos y Proveedores

## 📖 Descripción
Este proyecto es una aplicación de gestión de productos y proveedores utilizando **JPA (Java Persistence API)** con soporte para múltiples bases de datos (**PostgreSQL y SQLite**). Está desarrollado en **Java** y utiliza **Jakarta EE, DeltaSpike y Gradle** para la gestión de dependencias.

## 🚀 Características
- **Lenguajes**: 🟡 Java, 📄 SQL, 🛠️ Kotlin
- **Frameworks**: ☕ Jakarta EE, 🔥 DeltaSpike, 📦 Gradle
- **Persistencia**: 🗄️ JPA con soporte para **PostgreSQL** y **SQLite**
- **Inyección de Dependencias**: 🏗️ **CDI** (Contexts and Dependency Injection)

## 📂 Estructura del Proyecto
📦 `src/main/java/computacion/`
- 🏛️ `db/` → Contiene las entidades JPA (`Product`, `Supplier`, `Category`).
- 📁 `repository/` → Contiene los repositorios de datos (`ProductRepository`, `SupplierRepository`).
- ⚙️ `config/` → Configuración de JPA (`JpaConfig`).
- 🏁 `JpaMain.java` → Punto de entrada de la aplicación.

## 🛠️ Requisitos
✅ **JDK 11** o superior  
✅ **Gradle 7.0** o superior  
✅ **Docker** (opcional, para ejecutar PostgreSQL en contenedor)  
✅ **PostgreSQL y/o SQLite**  

## 🔧 Configuración

```sh
1️⃣ Clona el repositorio  
git clone https://github.com/kellyss1/practicaJPA.git
cd practicaJPA

2️⃣ Configura las unidades de persistencia  
Edita el archivo src/main/resources/META-INF/persistence.xml según la base de datos que vayas a utilizar.

3️⃣ Compila el proyecto  
gradle build
```

## 🏃‍♂️ Ejecución

```sh
gradle run
```

## 🐳 Configuración con Docker 
(PostgreSQL)
```sh
docker run --name postgres-store -e POSTGRES_USER=kelly -e POSTGRES_PASSWORD=1234kelly -e POSTGRES_DB=store -p 5432:5432 -d postgres:latest
```
(MySql)
```sh
docker run --name mysql-store -e MYSQL_ROOT_PASSWORD=1234kelly -e MYSQL_DATABASE=store -e MYSQL_USER=kelly -e MYSQL_PASSWORD=1234kelly -p 3306:3306 -d mysql:latest
```


