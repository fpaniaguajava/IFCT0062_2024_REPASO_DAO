package com.fernandopaniagua.repasodao.persistence.sql;

public class MovieDAOImplPostgre extends MovieDAOImplSQL {
    public MovieDAOImplPostgre() {
        dbURL = "jdbc:postgresql://localhost:5432/movies";
        dbUser = "user_app";
        dbPassword = "user_password";
    }
}
