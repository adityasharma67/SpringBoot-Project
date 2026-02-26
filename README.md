# SpringBoot-Project

> 🚀 **Custom Spring Boot Workspace**
>
> This repository is a personal showcase of multiple Spring Boot projects that
> I've developed from scratch to explore various features of the framework.
> Each module contained within the `SpringBoot-main` directory represents a
> standalone application focusing on a distinct aspect of building
> RESTful APIs, data access, or CRUD operations with Spring Boot.
>
> ## 📁 Project Structure
>
> - `SpringBoot-main/myApplication` – A template application with layered
>   architecture (Controller, Service, Repository, DTO, etc.). Used for general
>   experimentation and demonstrations of standard best practices.
> - `SpringBoot-main/springBootCRUD` – A basic CRUD application demonstrating
>   how to perform create/read/update/delete operations on entities using
>   Spring Data JPA and an in-memory database.
> - `SpringBoot-main/springBootDB` – A focused project showing database
>   integration, repository patterns, and simple REST controllers for managing
>   `Employee` entities.
>
> Each subproject contains its own `pom.xml`, Maven wrapper, and `src` folder
> with sample code, controllers, DTOs, repositories, and tests.
>
> ## 🛠️ Getting Started
>
> 1. Open a terminal and navigate to the subproject you want to run, e.g.:
>    ```bash
>    cd SpringBoot-Project/SpringBoot-main/myApplication
>    ```
> 2. Use the provided Maven wrapper to build and start the application:
>    ```bash
>    ./mvnw spring-boot:run
>    ```
> 3. The service will start on `http://localhost:8080` by default. Explore the
>    controllers using `curl` or a REST client.
>
> ## 🧩 Customization & Ownership
>
> Every piece of code here is authored and maintained by me. You're welcome to
> fork, adapt, and reuse patterns, but please respect the learning journey and
> give credit if you redistribute substantial amounts of this work.
>
> ## 📖 Additional Notes
>
> - Configuration properties are located in each project's
>   `src/main/resources/application.properties` file.
> - Unit tests are available under `src/test/java` and can be executed with
>   `./mvnw test`.
> - Build artifacts are produced in the `target/` directories and are excluded
>   from version control.
>
> Enjoy exploring the projects, and feel free to reach out with questions or
> suggestions!
