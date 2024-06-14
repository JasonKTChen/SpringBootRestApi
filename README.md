# Spring Boot REST API with CRUD Operations

This project demonstrates a RESTful API implementation using Spring Boot for CRUD operations between `Book` and `Author` entities in a MySQL database. Swagger is integrated for easy API documentation.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
  - [Running the Application](#running-the-application)
- [Swagger API Documentation](#swagger-api-documentation)
- [Testing](#testing)
- [Project Structure](#project-structure)
- [License](#license)

## Introduction

This project showcases a RESTful API built with Spring Boot that allows CRUD (Create, Read, Update, Delete) operations on `Book` and `Author` entities. It uses Spring Data JPA for data persistence with MySQL database. Swagger UI is integrated for API documentation.

## Technologies Used

- Java 11
- Spring Boot 2.5.1
- Spring Data JPA
- MySQL
- Springdoc OpenAPI (Swagger)
- Maven

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

Make sure you have the following installed:

- Java JDK 11
- MySQL Server
- Maven

### Configuration

1. **Database Configuration**:
   - Create a MySQL database
   - Update `application.properties` file (`src/main/resources/application.properties`) with your database configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/testdb?useSSL=false
     spring.datasource.username=root
     spring.datasource.password=password
     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     spring.jpa.hibernate.ddl-auto=update
     ```

2. **Swagger Configuration**:
   - Swagger UI will be available at `http://localhost:8080/swagger-ui.html`

### Running the Application

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-project.git
   cd your-project
2. Build and run the application using Maven:
   ```
   mvn spring-boot:run
   ```

## Swagger API Documentation
Swagger UI is integrated to document and test the APIs.

## Testing
Run tests using Maven
```
mvn test
```

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── sprintbootrestapi
│   │   │               ├── controller     # REST controllers
│   │   │               ├── configuration     # configuration
│   │   │               ├── domain
│   │   │                   ├── dto           # Data Transfer Objects
│   │   │                   ├── entity        # JPA Entity classes
│   │   │               ├── exception     # Custom exceptions
│   │   │               ├── repository    # Spring Data JPA repositories
│   │   │               ├── service       # Service classes
│   │   │               └── sprintbootrestapi.java   # Main application class
│   │   └── resources
│   │       └── application.properties    # Application properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── sprintbootrestapi
│                       └── BookServiceTest      # Unit tests for services
└── pom.xml      
```

## License
This project is licensed under the MIT License - see the LICENSE file for details.


