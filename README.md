# Overview

This is an MVP books records system using SpringBoot and React, with PostgreSQL
for the database.

# Description

There are 2 API calls available in the backend that have been implemented
according to the latest specifications in https://github.com/RyanToppan/CoDev-Assignment-FullStack-Spring, and a simple frontend to access
the book records.

1. GET /getTop3ReadBook - takes "country_code" query parameter and returns

- Top 3 rented books globally

- For each book, the Top 3 people with the most amount of that book rented in a specific country. (Specified countries using country codes SG , MY , US)

This means that the 3 books will not change as the country code changes,
only the borrowers associated with each book.

2. GET /getRandomCountry - returns a random country and its code to be used in the above API call

Sample data has been configured in the backend to ease testing.

# Installation and Set Up

Clone this repository into your local environment or download the .zip file.
The next few sections will cover the set up for the database, the frontend and
the backend.

## PostgresSQL Database Set Up

Create and connect to a local PostgresSQL database called "bookrecords",
with the following parameters:

```
    Server: localhost
    Database: bookrecords
    Port: 5433
    Username: postgres
    Password: postgres
```

Alternatively, edit
`bookrecords-project/bookrecords/src/main/resources/application.properties`
with the details of your created database.

## Spring Boot Backend Set Up

Open the `bookrecords` folder in Intellij or your Java IDE of choice. Run the
main method in `src/main/java/com/example/bookrecords/BookrecordsApplication.java`.
Sample data will populate specified PostgresSQL database upon start up.

## React Frontend Set Up

Run `npm start` from terminal while in the `frontend` directory or in the terminal
of your Javascript IDE of choice after opening up the project.
