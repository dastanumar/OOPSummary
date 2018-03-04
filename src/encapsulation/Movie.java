package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
	/*
	 * Encapsulated data:
	 *   double rating;
         String name;
     	 int year;
	 */
	private double rating;
	private String name;
	private int year;
	private static List<String> genres;
	
	static {
		 genres = new ArrayList<>();
		 genres.add("Comedy");
		 genres.add("Action");
		 genres.add("Adventure");
		 genres.add("Western");
		 genres.add("Historical");
		 genres.add("Thriller");
		 genres.add("Animation");
	}
	
	public Movie() {
		
	}
	
	public Movie(double rating,String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	
    public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movie [rating=3.4, name=Tiger, year=2012]";
		
	}
	
	public void watch() {
		System.out.println("Watching a movie: " + this.name);
	}


	public static List<String> getAvailibleGenres() {
    		return genres;
    }
    
   
	
}
