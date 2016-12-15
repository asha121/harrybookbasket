package com.clean.books.harry.potter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {
	@Test
	public void return_price_for_one_book() {
		BookBasket basket = new BookBasket();
		basket.add("HARRY_POTTER_BOOK_1");
		assertEquals(8d, basket.getBasketPrice(), 0);
	}

}
