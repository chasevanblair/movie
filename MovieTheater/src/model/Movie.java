package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="TITLE")
	private String title;
	@Column(name="PRICE")
	private double price;
	@Column(name="VIEWERS")
	private int viewers;
	
	public Movie() {
		super();
	}
	
	public Movie(String title, String price, String viewers) {
		super();
		this.title = title;
		this.price = Double.parseDouble(price);
		this.viewers = Integer.parseInt(viewers);
		
	}
	
	public String movieDetails() {
		return "ID :" + id + ", Title: " + title + ", price: " + price + ", viewers: " + viewers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getViewers() {
		return viewers;
	}

	public void setViewers(int viewers) {
		this.viewers = viewers;
	}
	

}
