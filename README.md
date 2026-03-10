# DOSW Docker Lab

Aplicacion web construida con **Spring Boot**, disenada para ser empaquetada con **Docker** y desplegada en **AWS EC2**.

## Descripcion

Proyecto Maven en Java 17 que expone un endpoint REST usando Spring Boot. El puerto se configura mediante la variable de entorno `PORT` (por defecto `6000`).

## Estructura

```
DOSW-Docker-Lab/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    ├── main/
    │   └── java/co/edu/escuelaing/dockerlab/
    │       ├── RestServiceApplication.java    <- Entry point (@SpringBootApplication)
    │       └── controller/
    │           └── HelloRestController.java   <- GET /greeting
    └── test/
        └── java/co/edu/escuelaing/dockerlab/
            └── AppTest.java
```

## Requisitos

- Java 17+
- Maven 3.6+

## Compilar

```bash
mvn clean install
```

Las dependencias quedan en `target/dependency/` para uso posterior con Docker.

## Ejecutar localmente

```bash
java -cp "target/classes;target/dependency/*" co.edu.escuelaing.dockerlab.RestServiceApplication
```

Acceder en:
- `http://localhost:6000/greeting`
- `http://localhost:6000/greeting?name=Diego`

## Tests

```bash
mvn test
```

**Resultado:**  
![Tests](docs/img/tests.png)
