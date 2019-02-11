
public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;
	private Node<T> current;
	
	public BinaryTree(){
		
	}
	
	public boolean add(T value) {
		if (root == null) {
			root = new Node<T>(value);
			return true;
		}
		current = root;
		while (current != null) {
			if (value.compareTo(current.getValue()) == 0) {	// if value is the current
				if (!current.getDelete()) {
					return false;
				}
				else {
					current.undelete();
					return true;
				}
			}
			else if (value.compareTo(current.getValue()) < 0) {	// if value is less than current
				if (current.getLeft() == null) {
					current.setLeft(new Node<T>(value));
					return true;
				}
				else {
					current = current.getLeft();
				}
			}
			else {									// if value is greater than current
				if (current.getRight() == null) {
					current.setRight(new Node<T>(value));
					return true;
				}
				else {
					current = current.getRight();
				}
			}
		}
		return false;		
	}
	
	public Node<T> search(T value){
		current = root;
		while (current != null) {
			if (value.compareTo(current.getValue()) == 0) {
				if (!current.getDelete()) {
					return current;
				}
				return null;
			}
			else if (value.compareTo(current.getValue()) < 0) {
				current = current.getLeft();
			}
			else if (value.compareTo(current.getValue()) > 0) {
				current = current.getRight();
			}
		}
		return null;
	}
	
	public boolean remove(T value) {
		current = root;
		while (current != null) {
			if (value.compareTo(current.getValue()) == 0) {
				if (current.getDelete() == false) {
					current.delete();
					return true;
				}
				else {
					return false;
				}
			}
			else if (value.compareTo(current.getValue()) < 0) {
				current = current.getLeft();
			}
			else {
				current = current.getRight();
			}
		}
		return false;
	}
}
