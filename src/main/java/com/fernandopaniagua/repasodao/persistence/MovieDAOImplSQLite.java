package com.fernandopaniagua.repasodao.persistence;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;

import java.sql.*;
import java.util.ArrayList;
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
    public Movie read(int id) throws PersistenceException {
        Movie movie = null;
        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            String sql = "SELECT * FROM movie WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                movie = new Movie(
                                rs.getInt("id"),
                                rs.getString("title"),
                                rs.getString("director"));
            }
        } catch (SQLException sqle) {
            throw new PersistenceException(sqle.getMessage());
        }
        return movie;
    }

    @Override
    public List<Movie> readAll() throws PersistenceException {
        List<Movie> movies = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            String sql = "SELECT * FROM movie";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Movie movie = new Movie(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("director"));
                movies.add(movie);
            }
        } catch (SQLException sqle) {
            throw new PersistenceException(sqle.getMessage());
        }
        return movies;
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(int id) {

    }
}
