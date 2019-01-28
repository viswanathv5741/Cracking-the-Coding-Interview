import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Queue2StacksTest {
	
/*	@Test
	public void testIsEmpty() {
		Queue2Stacks<Integer> nums = new Queue2Stacks<Integer>();
		assertTrue(nums.isEmpty());
		Node<Integer> n1 = new Node<Integer>(1);
		nums.add(n1);
		Node<Integer> n2 = new Node<Integer>(2);
		nums.add(n2);
		assertFalse(nums.isEmpty());
	}*/
	
/*	@Test
	public void testAdd() {
		Queue2Stacks<Integer> nums = new Queue2Stacks<Integer>();
		Node<Integer> n1 = new Node<Integer>(1);
		nums.add(n1);
		Node<Integer> n2 = new Node<Integer>(2);
		nums.add(n2);
		assertEquals(Integer.valueOf(1), nums.remove());
		assertEquals(Integer.valueOf(2), nums.remove());
		assertTrue(nums.isEmpty());
	}*/
	
/*	@Test
	public void testRemove() {
		Queue2Stacks<Integer> nums = new Queue2Stacks<Integer>();
		Node<Integer> n1 = new Node<Integer>(1);
		nums.add(n1);
		Node<Integer> n2 = new Node<Integer>(2);
		nums.add(n2);
		Node<Integer> n3 = new Node<Integer>(3);
		nums.add(n3);
		Node<Integer> n4 = new Node<Integer>(4);
		nums.add(n4);
		assertEquals(Integer.valueOf(1), nums.remove());
		assertEquals(Integer.valueOf(2), nums.remove());
		assertEquals(Integer.valueOf(3), nums.remove());
		assertEquals(Integer.valueOf(4), nums.remove());
	}*/
	
	@Test
	public void testPeek() {
		Queue2Stacks<Integer> nums = new Queue2Stacks<Integer>();
		Node<Integer> n1 = new Node<Integer>(1);
		nums.add(1);
		Node<Integer> n2 = new Node<Integer>(2);
		nums.add(2);
		Node<Integer> n3 = new Node<Integer>(3);
		nums.add(3);
		Node<Integer> n4 = new Node<Integer>(4);
		nums.add(4);
		assertEquals(Integer.valueOf(1), nums.peek());
	}
}
