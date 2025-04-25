package com.fernandopaniagua.repasodao.persistence;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MovieDAOImplSQLite implements IMovieDAO{
    private static final String dbURL = "jdbc:sqlite:/Users/tardes/IdeaProjects/IFCT0062_2024_REPASO_DAO/movies.db";
    private static final String dbUser = "";
    private static final String dbPassword = "";

    @Override
    public void create(Movie movie) throws PersistenceException {
        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            String sql = "INSERT INTO movie(title, director) VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, movie.getTitle());
            pstmt.setString(2, movie.getDirector());
            pstmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new PersistenceException(sqle.getMessage());
        }
    }

    @Override
    public Movie read(int id) {
        return null;
    }

    @Override
    public List<Movie> readAll() {
        return List.of();
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(int id) {

    }
}
