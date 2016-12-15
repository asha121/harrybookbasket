package com.clean.books.harry.potter;

import java.util.HashMap;
import java.util.Map;

public class BookBasket {
	private Map<Book, Integer> booksInBasket;

	public void add(Book book) {
		Integer count = this.booksInBasket.get(book);
		if (count == null) {
			count = 0;
		}
		this.booksInBasket.put(book, count + 1);
	}

	public BookBasket() {
		this.booksInBasket = new HashMap<Book, Integer>();
	}

	public double getBasketPrice() {
		double price = 0;

		if (booksInBasket.size() == 1)
			price = 8d;
		else if (booksInBasket.size() == 2)
			price = 15.2d;
		else if (booksInBasket.size() == 3)
			price = 21.6d;
		else if (booksInBasket.size() == 4)
			price = 25.6d;
		else
			price = 30d;
		return price;
	}

}
