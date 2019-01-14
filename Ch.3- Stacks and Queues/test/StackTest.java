import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {

	@Test
	public void testIsEmpty() {
		Stack<Integer> nums = new Stack<>();
		assertTrue(nums.isEmpty());
	}
	
	@Test
	public void testPush() {
		Stack<Integer> nums = new Stack<>();
		Node<Integer> a = new Node<>(1);
		nums.push(a);
		assertTrue(nums.first.equals(a));
		Node<Integer> b = new Node<>(2);
		nums.push(b);
		assertTrue(nums.first.equals(b));
	}
	
	@Test
	public void testPop() {
		Stack<Integer> nums = new Stack<>();
		Node<Integer> a = new Node<>(1);
		nums.push(a);
		assertTrue(nums.first.equals(a));
		Node<Integer> b = new Node<>(2);
		nums.push(b);
		assertEquals(b, nums.pop());
	}
	
	@Test
	public void testPeek() {
		Stack<Integer> nums = new Stack<>();
		Node<Integer> a = new Node<>(1);
		nums.push(a);
		assertTrue(nums.first.equals(a));
		Node<Integer> b = new Node<>(2);
		nums.push(b);
		assertEquals(b.getValue(), nums.peek());
		assertEquals(b, nums.first);
	}
}
