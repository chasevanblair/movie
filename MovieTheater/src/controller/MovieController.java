package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListItem;
import model.Movie;

public class MovieController {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MovieTheater");

	
	public static List<Movie> showAllMovies(){
		EntityManager em = emfactory.createEntityManager();
		List<Movie> allItems = em.createQuery("SELECT * FROM moviesr").getResultList();
		em.close();
		
		return allItems;
	}
	
	public static void addMovie(String name, String price, String viewers) {
		//cast strings to double,int : price, viewers
		
		EntityManager em = emfactory.createEntityManager();
		
		/*Movie toAdd = new Movie(name, Double.parseDouble(price), Integer.parseInt(viewers));
		em.merge(toAdd);
		em.close();
		*/ 
		Movie toAdd = new Movie(name, price, viewers);

		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}
	public static void main(String[] args) {
		addMovie("x", "2.99", "3");
		System.out.println(showAllMovies());
	}

}
