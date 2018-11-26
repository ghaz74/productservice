package com.example.business;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogImpl {
	private List<String> bookList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();
	
	public ProductCatalogImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Game of Throne");
		
		musicList.add("Random Access Memmory");
		musicList.add("JukeBox");
		musicList.add("Memmory");
		
		movieList.add("Oz");
		movieList.add("Snow White");
		movieList.add("Star Wars: Return of the Jedi");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movie":
			return movieList;
		}
		return null;
	}
	
	public boolean addMovie(String movieName) {
		boolean status = false;
		if (movieName != null) {
			movieList.add(movieName);
			status = true;
		}
		return status;
	}
	
}
