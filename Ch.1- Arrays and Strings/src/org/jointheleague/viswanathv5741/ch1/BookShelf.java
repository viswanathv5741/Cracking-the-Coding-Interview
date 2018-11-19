package org.jointheleague.viswanathv5741.ch1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShelf {
	
	//private List<Book> books = new ArrayList<Book>();
	private Map<Book, Integer> books = new HashMap<Book, Integer>();
	
	public BookShelf(Book book) {
		for (int i=0; i<books.keySet().size(); i++) {
		}
		books.put(book, books.size()+1);
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
