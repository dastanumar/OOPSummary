package inheritance;

import abstraction.Rentable;
import encapsulation.Movie;

public class Action extends Movie implements Rentable{

	public Action(double rating, String name, int year) {
		super(rating,name,year);
	}
	@Override
	public void watch() {
		System.out.println("Watching an Action movie: " + getName());
	}
	public void watch(double rating) {
		if(getRating() > rating) {
			System.out.println("watching movie");
		}else {
			System.out.println(getName() + "rating is not above "+ rating);
		}
	}
	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("Renting an Action Movie " + getName());
	}
	
	
}
