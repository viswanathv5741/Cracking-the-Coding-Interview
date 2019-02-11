
public class Node <T extends Comparable <T>> {
	private final T value;
	private Node<T> left;
	private Node<T> right;
	private boolean deleted;
	
	public Node(T val) {
		value = val;
		undelete();
	}
	
	public boolean getDelete() {
		return deleted;
	}
	
	public void delete() {
		deleted = true;
	}
	
	public void undelete() {
		deleted = false;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setRight(Node<T> n) {
		this.right = n;
	}
	
	public Node<T> getRight(){
		return this.right;
	}
	
	public void setLeft(Node<T> n) {
		this.left = n;
	}
	
	public Node<T> getLeft() {
		return this.left;
	}
}
