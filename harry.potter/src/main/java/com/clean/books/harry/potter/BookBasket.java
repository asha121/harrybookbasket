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
		if (booksInBasket.size() == 1)
			return 8d;
		else if (booksInBasket.size() == 2)
			return 15.2d;
		else if (booksInBasket.size() == 3)
			return 21.6d;
		else
			return 25.6d;
	}

}
