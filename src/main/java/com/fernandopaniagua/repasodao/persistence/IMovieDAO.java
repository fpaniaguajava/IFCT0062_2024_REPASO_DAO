package com.fernandopaniagua.repasodao.persistence;

import java.sql.SQLException;
import java.util.List;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;

public interface IMovieDAO {
    public void create(Movie movie) throws PersistenceException;
    public Movie read(int id) throws PersistenceException;
    public List<Movie> readAll() throws PersistenceException;;
    public void update(Movie movie);
    public void delete(int id);
}
