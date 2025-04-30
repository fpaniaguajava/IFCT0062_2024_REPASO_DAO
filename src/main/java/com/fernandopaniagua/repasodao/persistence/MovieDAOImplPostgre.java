package com.fernandopaniagua.repasodao.persistence;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOImplPostgre extends MovieDAOImplSQL {
    public MovieDAOImplPostgre() {
        dbURL = "jdbc:postgresql://localhost:5432/movies";
        dbUser = "user_app";
        dbPassword = "user_password";
    }
}
