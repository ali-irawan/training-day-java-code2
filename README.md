# Project Documentation for Spring Product API

## Overview
This project is a Spring Boot application that provides a simple RESTful API for managing products. It includes a single endpoint that returns a list of products in JSON format.

## Project Structure
```
spring-product-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── product
│   │   │               ├── ProductApplication.java
│   │   │               ├── controller
│   │   │               │   └── ProductController.java
│   │   │               └── model
│   │   │                   └── Product.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Features
- **GET /api/products**: Returns an array of Product objects in JSON format. Each Product contains:
  - `id`: Unique identifier for the product.
  - `name`: Name of the product.
  - `price`: Price of the product.

## Getting Started
1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using Maven:
   ```
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080/api/products`.

## Dependencies
This project uses the following dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Test (for testing)

## License
This project is licensed under the MIT License.