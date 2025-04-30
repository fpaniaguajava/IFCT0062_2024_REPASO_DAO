package com.fernandopaniagua.repasodao;

import com.fernandopaniagua.repasodao.exceptions.PersistenceException;
import com.fernandopaniagua.repasodao.model.Movie;
import com.fernandopaniagua.repasodao.persistence.IMovieDAO;
import com.fernandopaniagua.repasodao.persistence.MovieDAOFactory;
import com.fernandopaniagua.repasodao.util.PropertiesReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        IMovieDAO movieDAO = MovieDAOFactory.getMovieDAO();
//
//        Movie elconclave = new Movie(1, "La maldición", "Desconocido");
//        try {
//            movieDAO.create(elconclave);
//            System.out.println(("Registro creado"));
//        } catch (PersistenceException sqle) {
//            System.err.println(sqle.getMessage());
//        }

        /*
        try {
            Movie peliculaLeida = movieDAO.read(1);
            System.out.println(peliculaLeida);
        } catch (PersistenceException sqle) {
            System.err.println(sqle.getMessage());
        }
        */


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
    }
}