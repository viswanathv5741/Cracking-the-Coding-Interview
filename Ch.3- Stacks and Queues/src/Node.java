
public class Node<T> {
	private final T value;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T val){
		value = val;
	}
	
	public T getValue() {
		return value;
	}
	
//	public void Append(T val) {
//		Node add = new Node(val);
//		Node n = this;
//		while (n.next != null) {
//			n = n.next;
//		}
//		n.next = add;
//	}
	
	public void setNext(Node<T> n) {
		this.next = n;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
//	public void setPrevious(Node<T> n) {
//		this.previous = n;
//	}
//	
//	public Node<T> getPrevious(){
//		return this.previous;
//	}
}
