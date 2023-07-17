# KJSS_Assignment

Simple Appliacation Form  where we user can  add a information  of JobRole , which Departement he is from .The API is implemented using Java  with the Spring Boot framework and includes Swagger documentation for easy exploration of the available endpoints.

## Features
- User Roles: User can add their Information
  
## Prerequisites

- Java 
- MySQL Database


## API Documentation
The API documentation is generated using Swagger. You can explore the available endpoints using the Swagger UI interface.

To access the Swagger UI, open a web browser and go to http://localhost:8083/swagger-ui.html.

The Swagger UI provides a user-friendly interface to view and interact with the API endpoints very Easily . You can try out the different operations, view request and response details, and even make test requests directly from the UI.

## Usage
The API provides the following endpoints:
#Job Role
* GET /role: Get a list of all Role.
* POST /role: Create a new jobRole.
* GET /role/getRoleById/{id}: Get details of a specific JobRole .
* GET /role/getByJobRole/{JobRole}:get Information Using JobRole.
* DELETE /role/Deleted By Id/ {id}: Delete a specific JobRole .
  # Department
* GET /department: Get a list of Departments .
* POST /department: Create a new Department .
* GET /department/getById/{id}: Get details of a specific Department .
* DELETE /department/deleteById/{id}: Delete a specific Department.
  # Application
* Post /application/addApplication  : Create Application.
* GET /application/getApplication/{id} : get Application By ID.
* GET /application/getAllApplications : Get All Applications.
* DELETE /application/deleteById/{id} : Delete Application Using ID.
## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:

* spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
* spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
* spring.datasource.username = <userName>
* spring.datasource.password = <password>
* spring.jpa.show-sql = true
* spring.jpa.hibernate.ddl-auto = update

* spring.jpa.properties.hibernate.show_sql=true
* spring.jpa.properties.hibernate.use_sql_comments=true
* spring.jpa.properties.hibernate.format_sql=true
## Language Used
Java
  
Certainly! Here's an updated version of the README file that includes a project summary:

## Project Summary
The Application Project  Service API offers the following features:

* Job Role Management:
  
Job Role it is used to Add A JobRole , Get Job Role , Delete Job Role and user the Many to One Mapping to Department because many job role belong to the One Department .

* Department Management:
  
User can create department and fetch information and delete .
Annotation-based validation ensures data integrity and prevents invalid inputs.

* Application Management:

In Application user can add fetch , Delete and Post the Application and in this we using a Many to one Mapping with Job Role.

* Documentation:

Integration with Swagger to generate comprehensive API documentation.
Swagger UI provides an interactive interface for exploring and testing the API endpoints.


## Contributing
Adesh Mutadak
