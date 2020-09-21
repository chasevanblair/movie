package view;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import controller.MovieController;
import model.Movie;

public class MovieViewer {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MovieTheater");
	static Scanner in = new Scanner(System.in);
	static MovieController movie = new MovieController();
	
	public void addMovie(String name, String price, String viewers) {
		//cast strings to double,int : price, viewers
		
		EntityManager em = emfactory.createEntityManager();
		System.out.print("Enter name of movie: ");
		String name = in.nextLine();
		System.out.print("Enter price of ticket: ");
		String price = in.nextLine();
		System.out.print("Enter amount of viewers: ");
		String viewers = in.nextLine();
		Movie toAdd = new Movie(name, price, viewers);
		movie.addMovie(toAdd);
	}
}
