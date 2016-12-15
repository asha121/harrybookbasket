package com.clean.books.harry.potter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		double price = 0.0d;
		while (booksInBasket.size() > 0) {
			int diffBooksCount = 0;
			Iterator<Entry<Book, Integer>> iterator = booksInBasket.entrySet().iterator();
			price = getPrice(price, getDifferentBookCount(diffBooksCount, iterator));
		}
		return price;
	}

	private int getDifferentBookCount(int diffBooksCount, Iterator<Entry<Book, Integer>> iterator) {
		while (iterator.hasNext()) {
			Entry<Book, Integer> book = iterator.next();
			if (diffBooksCount == 3 && booksInBasket.size() == 3) {
				break;
			}
			if (book.getValue() == 1) {
				iterator.remove();
			} else {
				book.setValue(book.getValue() - 1);
			}
			diffBooksCount++;
		}
		return diffBooksCount;
	}

	private double getPrice(double price, int diffBooksCount) {
		if (diffBooksCount == 1) {
			price += 8d;
		} else if (diffBooksCount == 2) {
			price += 15.2d;
		} else if (diffBooksCount == 3) {
			price += 21.6d;
		} else if (diffBooksCount == 4) {
			price += 25.6d;
		} else {
			price += 30d;
		}
		return price;
	}

}
