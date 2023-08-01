
Project Description

This is a project with a three-level development architecture. It is a backend Java application built using Java 17, Spring Boot 3, and MySQL 8. The application uses REST architectural style and JSON format for the API. 

Technologies

Java 17,
Spring Boot 3,
MySQL 8,
Log4j2

Endpoints

http://localhost:8080/users - POST endpoint for adding a user with fields for firstname, lastname, patronymic, Email, and Role.
Example json for a request to create a user :

{
"firstname": "alex",
"lastname": "smith",
"patronymic": "frank",
"email": "alex@mail.com",
"role": "1"
}

mapping roles:

1 : Administrator;
2 : Sale User;
3 : Customer User;
4 : Secure API User.

/users - GET endpoint to get all users with fields for Full Name, Email, and Role. Use ?page=0 for pagination. Entries are sorted alphabetically by email and paginated to show 10 records.


