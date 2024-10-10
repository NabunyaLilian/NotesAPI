# Notes API

## Overview

The **Notes API** is a RESTful web service that allows users to create, read, update, and delete notes. It is built using Spring Boot and provides a simple and efficient way to manage notes.

## Features

- **Create a Note**: Add a new note to the system.
- **Read Notes**: Retrieve all notes or a specific note by ID.
- **Update a Note**: Modify an existing note.
- **Delete a Note**: Remove a note from the system.
- **Swagger Documentation**: Access API documentation and interactive endpoints using Swagger UI.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Swagger (OpenAPI)
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Clone the Repository

```bash
git clone https://github.com/yourusername/notes-api.git
cd notes-api
```

### Build the project

```bash
mvn clean install
```
### Run the Application

```bash
mvn spring-boot:run
```

### Accessing the API

```bash
http://localhost:8081/
```

### Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| POST   | `/api/notes`           | Create a new note            |
| GET    | `/api/notes`           | Get all notes                |
| GET    | `/api/notes/{id}`      | Get a note by ID             |
| PUT    | `/api/notes/{id}`      | Update a note by ID          |
| DELETE | `/api/notes/{id}`      | Delete a note by ID          |


### Swagger UI

```bash
http://localhost:8080/swagger-ui.html
```




