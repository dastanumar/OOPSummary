package polymorphism;

import java.util.ArrayList;
import java.util.List;

import encapsulation.Movie;
import inheritance.Action;
import inheritance.Comedy;

public class Netflix {
	public static List<Movie> getMoviesList() {

		List<Movie> movies = new ArrayList<>();
		movies.add(new Action(6.3, "Last Key", 2014));
		movies.add(new Action(7.3, "Jumanji", 2017));
		movies.add(new Movie(6.3, "Star Wars", 201));
		movies.add(new Movie(7.3, "I, tonya", 1999));
		movies.add(new Comedy(6.6, "Google", 201));
		movies.add(new Comedy(9.3, "the post", 1999));

		return movies;
	}

	public Movie rentARandom(String genre) {
		List<Movie> available = getMoviesList();
		for (Movie movie : available) {
			if (genre.equals("Action")) {
				if (movie instanceof Action) {
					return movie;
				} else if (genre.equals("Comedy")) {
					if (movie instanceof Comedy) {
						return movie;
					}
				} else if (genre.equals("Movie")) {
					if (movie instanceof Movie) {
						return movie;
					}
				}
			}
		}
		
		return null;
	}
}
