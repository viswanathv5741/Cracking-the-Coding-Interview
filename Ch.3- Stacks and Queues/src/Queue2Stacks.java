
public class Queue2Stacks<T> {
	private Stack<T> head;
	private Stack<T> tail;
	
	public Queue2Stacks() {
		head = new Stack<T>();
		tail = new Stack<T>();
	}
	
	public void add(T n) {
		tail.push(n);
	}
	
	public T remove(){
		if (head.isEmpty()) {
			while (!tail.isEmpty()) {
				//Node<T> temp = new Node<T>(tail.pop());
				head.push(tail.pop());
			}
		}
		return head.pop();
	}
	
	public T peek() {
		if (head.isEmpty()) {
			while (!tail.isEmpty()) {
				//Node<T> temp = new Node<T>(tail.pop());
				head.push(tail.pop());
			}
		}
		return head.peek();
	}
	
	public boolean isEmpty() {
		return (head.isEmpty() && tail.isEmpty());
	}
}
