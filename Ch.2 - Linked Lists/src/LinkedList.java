import java.io.IOException;

public class LinkedList<T> {
	private Node<T> first;
	private Node<T> last;
	
	public LinkedList() {
		
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Node<T> getFirst(){
		return first;
	}
	
	public Node<T> getLast(){
		return last;
	}
	
	public void setFirst(Node<T> x) {
		first = x;
	}
	
	public void setLast(Node<T> y) {
		last = y;
	}
	
	public void append(Node<T> n) {
		if (this.isEmpty()) {
			first = last = n;
		} else {
			last.setNext(n);
			n.setPrevious(last);
			last = n;
		}
	}
	
	public void push(Node<T> a) {
		if (this.isEmpty()) {
			this.append(a);
		}
		else {
			a.setNext(first);
			first.setPrevious(a);
			first = a;
		}
	}
	
	public void removeLast() {
		if (this.isEmpty()) {
			try {
				throw new IOException("Illegal");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (first == last) {
			first = last = null;
		} else {
			Node<T> pos = last.getPrevious();
//			while (pos.getNext() != last) {
//				System.out.println(pos.getValue());
//				pos = pos.getNext();
//			}
			pos.setNext(null);
			last = pos;
			System.out.println(last.getValue());
		}
	}
	
	public void removeVal(T val) {
		Node<T> pos = first;
		while (!pos.getValue().equals(val)) {
			System.out.println(pos.getValue());
			pos = pos.getNext();
		}
		Node<T> posUp = pos.getNext();
		posUp.setPrevious(pos.getPrevious());
		pos = null;
	}
	
	
}
