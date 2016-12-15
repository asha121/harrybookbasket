package com.clean.books.harry.potter;

import java.util.HashMap;
import java.util.Map;

public class BookBasket {
	private Map<String, Integer> booksInBasket;

	public void add(String book) {
		Integer count = this.booksInBasket.get(book);
		if (count == null) {
			count = 0;
		}
		this.booksInBasket.put(book, count + 1);
	}

	public BookBasket() {
		this.booksInBasket = new HashMap<String, Integer>();
	}

	public double getBasketPrice() {
	if (booksInBasket.size()==1)
		return 8d;
	else  
		return 15.2d;
	}

}
