
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
	
	public Node<T> pop(){
		return first;
	}
	
	public T peek() {
		return first.getValue();
	}
	

}
