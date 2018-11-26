package org.jointheleague.viswanathv5741.ch1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestBookShelf {
	
	@Test
	public void testBookShelf() {
		
		Book hp1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K Rowling", 1);
		Book hp2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K Rowling", 1);
		Book hp3 = new Book("Harry Potter and the Chamber of Secrets", "J.K Rowling", 1);
		Book hp4 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K Rowling", 1);
		Book hp5 = new Book("Harry Potter and the Goblet of Fire", "J.K Rowling", 1);
		Book hp6 = new Book("Harry Potter and the Order of the Phoenix", "J.K Rowling", 1);
		Book hp7 = new Book("Harry Potter and the Half Blood Prince", "J.K Rowling", 1);
		Book hp8 = new Book("Harry Potter and the Deathly Hollows", "J.K Rowling", 1);
		
		//symmetry
		//reflexivity
		//transitivity
		
		BookShelf bs1 = new BookShelf();
		
		bs1.addBook(hp1);
		bs1.addBook(hp2);
		bs1.addBook(hp5);
		
		//System.out.println(bs1.getBooks());
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(hp1);
		expected.add(hp2);
		expected.add(hp5);
		assertEquals(expected, bs1.getBooks());
		
//		assertTrue(bs1.removeBook(hp1));
//		assertFalse(bs1.removeBook(hp8));
//		
//		bs1.addBook(hp1);
		
		BookShelf bs2 = new BookShelf();
		
		bs2.addBook(hp2);
		bs2.addBook(hp2);
		bs2.addBook(hp5);
		
		// bs1 should equal bs2
		assertEquals(bs1, bs2);
		ArrayList<Book> bs2Books = new ArrayList<Book>(bs2.getBooks());
		assertEquals(bs1.getBooks(), bs2Books);
		bs2Books.add(hp7);
		assertNotEquals(bs2.getBooks(), bs2Books);
		
		BookShelf bs3 = new BookShelf();
		
		bs3.addBook(hp5);
		bs3.addBook(hp2);
		bs3.addBook(hp1);
		
		//bs3 = bs2 = bs1
		assertEquals(bs1, bs3);
		assertEquals(bs2, bs3);
		assertNotEquals(bs1.getBooks(), bs3.getBooks());
		
		BookShelf bs4 = new BookShelf(); //bs4 is an empty bookshelf
		assertNotEquals(bs1, bs4);
		
		BookShelf bs5 = new BookShelf();
		assertEquals(bs4, bs5);
		
		BookShelf bs6 = new BookShelf();
		bs6.addBook(hp1);
		bs6.addBook(hp2);
		bs6.addBook(hp5);
		bs6.addBook(hp3);
		bs6.addBook(hp4);
		bs6.addBook(hp6);
		bs6.addBook(hp7);
		bs6.addBook(hp8);
		
		assertNotEquals(bs1, bs6);
		
		BookShelf bs7 = null;
		
		assertNotEquals(bs4, bs7);
		
	}
}
