
public class StackofStacks<T> {
	private Stack<Stack<T>> stack_Out = new Stack<>();
	private int size=0;
	private int capacity;
	
	public StackofStacks(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(T value) {
		Stack<T> topStack;
		if (size  == 0) {
			topStack = new Stack<T>();
			topStack.push(value);
			stack_Out.push(topStack);
			size = 1;
		}
		else {
			topStack = stack_Out.peek();
			if (topStack.size() < capacity) {
				topStack.push(value);
				size ++;
			}
			else {
				topStack = new Stack<T>();
				topStack.push(value);
				stack_Out.push(topStack);
				size = 1;
			}
		}
	}
	
	public T pop() {		
		Stack<T> topStack = stack_Out.peek();
		if (topStack.size() == 1) {
			stack_Out.pop();
			size = capacity;
		}
		else {
			size --;
		}
		return topStack.pop();
	}
	
	public T peek() {
		Stack<T> topStack = stack_Out.peek();
		return topStack.peek();
	}
	
	public boolean isFull() {
		if (stack_Out.peek().size() > capacity) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
}
