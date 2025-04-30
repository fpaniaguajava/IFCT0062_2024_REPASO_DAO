package com.fernandopaniagua.repasodao.persistence.hibernate;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;
import com.fernandopaniagua.repasodao.persistence.IMovieDAO;
import org.hibernate.Session;

import java.util.List;

public class MovieDaoImplHibernate implements IMovieDAO {
    @Override
    public void create(Movie movie) throws PersistenceException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.persist(movie);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Movie read(int id) throws PersistenceException {
        return null;
    }

    @Override
    public List<Movie> readAll() throws PersistenceException {
        return List.of();
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(int id) {

    }
}
