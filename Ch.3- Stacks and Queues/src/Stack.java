import java.util.EmptyStackException;

public class Stack<T> {
	Node<T> first;
	private int size;
	
	public Stack() {
		
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(T value) {
		Node<T> newFirst = new Node<T>(value);
		newFirst.setNext(first);
		first  = newFirst;
		size ++;
	}
	
	public T pop(){
		//Node<T> newFirst = first.getPrevious();
		if (first == null) {
			throw new EmptyStackException();
		}
		else {
			T item = first.getValue();
			first = first.getNext();
			size --;
			return item;
		}
	
	}
	
	public int size() {
		return size;
	}
	
	public T peek() {
		if (first != null) {
			return first.getValue();
		}
		else {
			throw new EmptyStackException();
		}
	}
	

}
