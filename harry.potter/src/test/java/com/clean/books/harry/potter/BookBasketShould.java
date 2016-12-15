package com.clean.books.harry.potter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {
	@Test
	public void return_price_for_one_book() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		assertEquals(8d, basket.getBasketPrice(), 0);
	}

	@Test
	public void return_price_for_different_book() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		assertEquals(15.2d, basket.getBasketPrice(), 0);
	}

	@Test
	public void return_price_for_different_3_books() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		assertEquals(21.6d, basket.getBasketPrice(), 0);
	}

	@Test
	public void return_price_for_different_4_books() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		basket.add(Book.HARRY_POTTER_BOOK_4);
		assertEquals(25.6d, basket.getBasketPrice(), 0);
	}

	@Test
	public void return_price_for_different_5_books() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		basket.add(Book.HARRY_POTTER_BOOK_4);
		basket.add(Book.HARRY_POTTER_BOOK_5);
		assertEquals(30d, basket.getBasketPrice(), 0);
	}

	@Test
	public void return_price_for_three_differen_and_two_same_books() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		basket.add(Book.HARRY_POTTER_BOOK_1);
		assertEquals(29.6d, basket.getBasketPrice(), 0);
	}
	
	@Test
	public void return_price_for_fiver_differen_and_pair_books() {
		BookBasket basket = new BookBasket();
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_1);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_2);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		basket.add(Book.HARRY_POTTER_BOOK_3);
		basket.add(Book.HARRY_POTTER_BOOK_4);
		basket.add(Book.HARRY_POTTER_BOOK_5);
		assertEquals(51.6d, basket.getBasketPrice(), 0);
	}
}
