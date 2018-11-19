package org.jointheleague.viswanathv5741.ch1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestBook {
	
	@Test
	public void testBooks() {
		
		Book book1 = new Book("Sourcerer's Stone", "J.K Rowling", 1);
		Book book2 = new Book("Sourcerer's Stone", "J.K Rowling", 1);
		Book book3 = new Book("Goblet of Fire", "J.K Rowling", 1);
		Book book4 = null;
		assertEquals(book1, book2);
		assertNotEquals(book2, book3);
		assertNotEquals(book3, book4);
		assertEquals(book1.hashCode(), book2.hashCode());
		//assertNotEquals(book2.hashCode(), book3.hashCode()); //normally they would not be equal but they may be equal; can fail
	}
}
