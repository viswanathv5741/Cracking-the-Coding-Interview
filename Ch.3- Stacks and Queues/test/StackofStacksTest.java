import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackofStacksTest {

	@Test
	public void testPush() {
		StackofStacks<Integer> stack = new StackofStacks<>(3);
		stack.push(3);
		assertEquals(1, stack.getSize());
		//assertEquals(Integer.valueOf(3), stack.pop());
		stack.push(5);
		stack.push(7);
		assertEquals(3, stack.getSize());
		stack.push(9);
		assertEquals(1, stack.getSize());
		assertEquals(Integer.valueOf(9), stack.pop());
	}
	
	@Test
	public void testPop() {
		StackofStacks<Integer> stack = new StackofStacks<>(3);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		assertEquals(Integer.valueOf(9), stack.pop());
		assertEquals(Integer.valueOf(7), stack.pop());
		assertEquals(Integer.valueOf(5), stack.pop());
		assertEquals(Integer.valueOf(3), stack.pop());
	}
	
	@Test
	public void testPeek() {
		StackofStacks<Integer> stack = new StackofStacks<>(3);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		assertEquals(Integer.valueOf(9), stack.peek());
		assertEquals(1, stack.getSize());
		stack.pop();
		assertEquals(Integer.valueOf(7), stack.peek());
		assertEquals(3, stack.getSize());
	}
}
