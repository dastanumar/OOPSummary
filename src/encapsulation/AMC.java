package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import abstraction.Rentable;
import inheritance.Action;
import inheritance.Comedy;

public class AMC {

	public static void main(String[] args) {
		
		Movie m1 = new Movie(7.0, "Jumanji", 2017);
		System.out.println(m1.toString());
		
		List<String> genres = Movie.getAvailibleGenres();
		System.out.println(genres);
		
		Movie[] movies = new Movie[3];
		movies[0] = new Movie(7.0, "Jumanji", 2018);
		movies[1] = new Movie(6.5, "12 Strong", 2017);
		movies[2] = new Movie(3.5, "The Commuter", 2016);
		
		System.out.println(Arrays.toString(movies));
		
		List<Movie> amcMovies = new ArrayList<>();
		amcMovies.add(new Movie(9.1, "Star Wars", 2000));
		amcMovies.add(new Movie(3.1, "Transphormers", 2010));
		amcMovies.add(new Movie(6.3, "Harry Potter", 2012));
		
		System.out.println(amcMovies);
		for(Movie movie : movies) {
			if(movie.getRating() > 5) {
				movie.watch();
			}
		}
		//=============================
		Action actionMovie = new Action(5.3, "Ferdinant", 2018);
		actionMovie.watch();
		
		// Polymorphic way of instantiation
		Movie actMovie = new Action(7.3, "Star Wars", 2014);
		actMovie.watch();
		
//		Action actMovie2 = (Action) new Movie(7.3, "Star wars", 2014);
//		actMovie2.watch();   --> ClassCastException
		
		Action action = (Action)actMovie;
		action.watch(5.5);
		
		((Action)actMovie).watch(2.9);
		
		Movie comedy = new Comedy(6.3, "Last Key", 2019);
		comedy.watch();
		
		System.out.println(Action.getAvailibleGenres());
		
		
		
	}
	
}
