package org.sahilpaudel;

/*
 * This file only shows the signature of the file
 * implementation is not shown.
 * inlude the jar file and enjoy.
 */

import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Sahil Paudel
 */
public class URLParser {
    
    private String urlname;
    
    private Movie movie;
	
    public URLParser(String url){
		this.urlname = url;
    } 
	
    //returns string of unstructured xml details about movie
    String getMetaData(String name) throws Exception{
			
        return inputLine;
    }
    //returns object of movie class
    public Movie getMovieData() throws Exception{
        
         String parseData = getMetaData(urlname);
		 
		 String movieActors, movieAwards, movieCountry, movieDirector, movieGenre, movieImdbRating, movieImdbVotes;
		 String movieLanguage, movieMetaScore, movieName, moviePlot, movieRuntime, movieType, movieWriters;
		 
            movie = new Movie();
            movie.setMovieName(movieName);
            movie.setActors(movieActors);
            movie.setAwards(movieAwards);
            movie.setCountry(movieCountry);
            movie.setPlot(moviePlot);
            movie.setDirector(movieDirector);
            movie.setGenre(movieGenre);
            movie.setImdbRating(movieImdbRating);
            movie.setImdbVotes(movieImdbVotes);
            movie.setType(movieType);
            movie.setMetaScore(movieMetaScore);
            movie.setYear(releasedYear);
			movie.setReleasedDate(releasedDate);
            movie.setRated(censorRated);
            movie.setRuntime(movieRuntime);
            movie.setWriter(movieWriters);
            movie.setLanguage(movieLanguage); 
            
            return movie;
    }
}
