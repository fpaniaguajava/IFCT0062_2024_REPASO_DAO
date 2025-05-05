package com.fernandopaniagua.repasodao;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;
import com.fernandopaniagua.repasodao.persistence.IMovieDAO;
import com.fernandopaniagua.repasodao.persistence.MovieDAOFactory;
import com.fernandopaniagua.repasodao.util.PropertiesReader;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IMovieDAO movieDAO = MovieDAOFactory.getMovieDAO();

        //CREATE
//        Movie elconclave = new Movie("El resplandor", "Desconocido");
//        try {
//            movieDAO.create(elconclave);
//            System.out.println(("Registro creado"));
//        } catch (PersistenceException sqle) {
//            System.err.println(sqle.getMessage());
//        }


        //READ
//        try {
//            Movie movie = movieDAO.read(5);
//            System.out.println(movie);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //READ ALL
//        try {
//            List<Movie> movies  = movieDAO.readAll();
//            //Opción 1
//            movies.forEach(System.out::println);
//            //Opción 2
//            /*
//            movies.forEach((pelicula)-> {
//                System.out.println(pelicula);
//            });
//            */
//        } catch (PersistenceException sqle) {
//            System.err.println(sqle.getMessage());
//        }

        //UPDATE
//        try {
//            Movie movie = movieDAO.read(5);
//            movie.setDirector(movie.getDirector() + "*");
//            movieDAO.update(movie);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //DELETE
        try {
            movieDAO.delete(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}