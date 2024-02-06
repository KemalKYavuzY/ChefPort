# Backend Application for Recipe Management

This backend application, built with Spring Boot, provides functionalities for recipe management and user authentication.

## Features:
- **User Management**: Allows users to sign up and login securely.
- **Recipe Management**: Provides endpoints for creating and retrieving recipes.
- **Spring Boot**: Utilizes the Spring Boot framework for rapid development and dependency management.

## Technologies Used:
- Java
- Spring Boot
- MongoDB

## How to Run:
1. Ensure you have Java and MongoDB installed on your system.
2. Clone this repository to your local machine.
3. Navigate to the project directory in your terminal.
4. Run `./gradlew bootRun` to start the application.
5. Access the API endpoints using your preferred HTTP client.

## Endpoints:
- **POST /users/signup**: Create a new user.
- **POST /users/login**: Log in as an existing user.
- **POST /recipes/newRecipe**: Create a new recipe.
- **GET /recipes/{recipeName}**: Get recipes by name.

## Note:
- This project is no longer actively maintained and serves as a demonstration of backend development skills.
- Feel free to explore and modify the code to suit your needs.
