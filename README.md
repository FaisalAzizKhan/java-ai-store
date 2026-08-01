```bash
# Running the app
mvn spring-boot:run

# Reload Maven
mvn clean

# Folders
controllers, entities, repositories, services, utils

# Dependencies

Spring Web: REST APIs (@RestController, @GetMapping, etc.)
Spring Boot DevTools: Auto restart on save (like nodemon)
Spring Data JPA: ORM (Hibernate)
PostgreSQL Driver: Connect to PostgreSQL
Validation: Request validation (@Valid, @NotBlank, @Email, etc.)
Lombok: Removes boilerplate (getters, setters, constructors)

git add .; git commit -m "feat: merge with main"; git push
