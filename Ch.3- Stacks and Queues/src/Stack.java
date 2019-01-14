import java.util.EmptyStackException;

public class Stack<T> {
	Node<T> first;
	
	public Stack() {
		
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(Node<T> n) {
		Node<T> newFirst = n;
		newFirst.setNext(first);
		first  = newFirst;
	}
	
	public T pop(){
		//Node<T> newFirst = first.getPrevious();
		if (first == null) {
			throw new EmptyStackException();
		}
		else {
			T item = first.getValue();
			first = first.getNext();
			return item;
		}
	
	}
	
	public T peek() {
		return first.getValue();
	}
	

}
