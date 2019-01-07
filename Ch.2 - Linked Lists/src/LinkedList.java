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
		if (!this.isEmpty()) {
			while (pos != null && !pos.getValue().equals(val)) {
				pos = pos.getNext();
			}
			if (pos == null) {
				return;
			}
			else if (last == first) {
//				first.setNext(null);
//				last.setPrevious(null);
				first = null;
				last = null;
			}
			else if (pos == last) {
				last = pos.getPrevious();
				pos.setPrevious(null);
				last.setNext(null);
			}
			else if (pos == first) {
				first = pos.getNext();
				pos.setNext(null);
				first.setPrevious(null);
			}
			else {
				Node<T> posUp = pos.getNext();
				posUp.setPrevious(pos.getPrevious());
				System.out.println(pos.getPrevious());
				System.out.println("following element of the one being removed: " + posUp.getValue());
				Node<T> posDown = pos.getPrevious();
				posDown.setNext(pos.getNext());
				System.out.println("previous element of the one being removed " + posDown.getValue());
			}
		
			pos = null;
		}
	}
	
	
}
