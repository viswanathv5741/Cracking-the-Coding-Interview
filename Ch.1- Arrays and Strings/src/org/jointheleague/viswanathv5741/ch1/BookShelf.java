package org.jointheleague.viswanathv5741.ch1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShelf {
	
	//private List<Book> books = new ArrayList<Book>();
	private Map<Book, Integer> books = new HashMap<Book, Integer>();
	private List<Book> bookList = new ArrayList<Book>();
	
	public BookShelf() {
			
	}
	
	public void addBook(Book book) {
		int amount;
		if (books.containsKey(book)) {
			amount = books.get(book) + 1;
			books.put(book, amount);
		}
		else {
			books.put(book, 1);
		}
		bookList.add(book);
	}
	
	public List<Book> getBooks(){
		ArrayList<Book> copyBooks = new ArrayList<Book>(bookList);
		return copyBooks;
	}
	
	public boolean removeBook(Book book) {
		if (books.containsKey(book)) {
			books.put(book, books.get(book) - 1);
			bookList.remove(book);
			if (books.get(book) == 0) {
				books.remove(book);
			}
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookShelf other = (BookShelf) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}
	
	
}
