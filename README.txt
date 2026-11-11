Session 14 | Exercise 1 — Configuração e perfis

Como correr
  dev (por omissão):  mvn spring-boot:run
                      GET http://localhost:8080/api/info
  prod:               mvn package -Pprod -DskipTests
    PowerShell:  $env:DB_URL="jdbc:h2:mem:library-prod"; $env:DB_USER="sa"; $env:DB_PASSWORD="prod123"; $env:DDL_AUTO="create"
    bash:        export DB_URL=jdbc:h2:mem:library-prod DB_USER=sa DB_PASSWORD=prod123 DDL_AUTO=create
    java -jar target/library-jpa-0.0.1-SNAPSHOT.jar
