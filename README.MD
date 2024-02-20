This Springboot application:
1. Provides REST CRUD operations
2. Uses H2 Databse
3. Initializes database with 1000s of book at startup


Generate data by copying the data.sql in /SQL_for_data_generation folder into ./src/main/resources folder.


Access H2 Database:
http://localhost:8080/h2-console

Get All Books:
http://localhost:8080/books

Get One Book:
http://localhost:8080/books/5

Delete One Book:
http://localhost:8080/books/8

Add a new Book:
http://localhost:8080/books
{
  "bookName": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "price": 22
}
