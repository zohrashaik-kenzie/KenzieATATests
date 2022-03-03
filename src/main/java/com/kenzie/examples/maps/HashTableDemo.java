package com.kenzie.examples.maps;

import java.time.LocalDate;
import java.util.*;

public class HashTableDemo {

    public static void main(String[] args){

        Movie movie1 = new Movie("Movie One ","Director 1",  LocalDate.of(2001, 10, 14));
        Movie movie2 = new Movie("Movie Two","Director 2",  LocalDate.of(2002, 10, 14));

        Movie movie3 = new Movie("Movie Three 3","Director 3",  LocalDate.of(2003, 10, 14));
        Movie movie4 = new Movie("Movie Four Two","Director 4",  LocalDate.of(2003, 10, 14));

        Map<String,Movie> movieMap = new HashMap<>();
        movieMap.put(hashMovieName(movie1.getName()),movie1);
        movieMap.put(hashMovieName(movie2.getName()),movie2);
        movieMap.put(hashMovieName(movie3.getName()),movie3);
        movieMap.put(hashMovieName(movie4.getName()),movie4);


//        //iterating over a Map
//        for(Map.Entry<String, Movie> entry : movieMap.entrySet()) {
//            System.out.println(String.format("Key: %s Value: %s",
//                    entry.getKey(), entry.getValue()));
//      }

//        for(String key : movieMap.keySet()) {
//            System.out.println(String.format("Key: %s Value: %s",
//                   key, movieMap.get(key)));
//        }

        Set<Actor> actorSet = new HashSet<>();
        Actor morgan = new Actor("Morgan Freeman",
                LocalDate.of(1937, 6, 1), "Memphis, Tennessee");
        Actor zohra = new Actor("Zohra Shaik",
                LocalDate.of(1937, 8, 14), "Cleveland, Ohio");

        actorSet.add(morgan);
        actorSet.add(zohra);

        Set<Movie> movieSet = new HashSet<>();
        movieSet.add(movie1);
        movieSet.add(movie3);

        Imdb imdb = new Imdb();
        imdb.releaseMovie(movie1,actorSet);
        imdb.actorMovies(morgan,movieSet);

        Set<Movie> morganMovies = imdb.getMoviesForActor(morgan);
        for(Movie movie: morganMovies){
            System.out.println(movie);
        }
    }

    public static String hashMovieName(String movieName){
        List<String> words = Arrays.asList(movieName.split(" "));

        return words.get(words.size() - 1);

    }
}
