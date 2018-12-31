import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

	@Test
	public void testIsEmpty(){
		LinkedList<Integer> testList = new LinkedList<>();
		assertTrue(testList.isEmpty());
	}
	
	@Test
	public void testAppend() {
		LinkedList<Integer> testList = new LinkedList<>();
		Node<Integer> a = new Node<>(5);
		testList.append(a);
		Node<Integer> b = new Node<>(6);
		testList.append(b);
		Node<Integer> c = new Node<>(7);
		testList.append(c);
		assertFalse(testList.isEmpty());
		assertEquals(a, testList.getFirst());
		assertEquals(c, testList.getLast());
		assertEquals(Integer.valueOf(7), testList.getLast().getValue());
	}
	
	@Test 
	public void testPush() {
		LinkedList<Integer> testList = new LinkedList<>();
		Node<Integer> a = new Node<>(1);
		testList.append(a);
		Node<Integer> b = new Node<>(2);
		testList.push(b);
		assertEquals(b, testList.getFirst());
		assertEquals(null, testList.getFirst().getPrevious());
		assertEquals(a, testList.getLast());
		assertEquals(b, testList.getLast().getPrevious());
	}
	
	@Test
	public void testRemoveLast() {
		LinkedList<String> testList = new LinkedList<>();
		Node<String> a = new Node<>("hi");
//		Node<String> b = new Node<>("how");
//		Node<String> c = new Node<>("you");
//		Node<String> d = new Node<>("doin");
		testList.append(a);
//		testList.append(b);
//		testList.append(c);
//		testList.append(d);
		testList.removeLast();
		assertTrue(testList.isEmpty());
		
	}
	
	@Test
	public void testRemoveVal() {
		LinkedList<Integer> testList = new LinkedList<>();
		Node<Integer> a = new Node<>(5);
		testList.append(a);
		Node<Integer> b = new Node<>(6);
		testList.append(b);
		Node<Integer> c = new Node<>(7);
		testList.append(c);
		testList.removeVal(6);
		assertEquals(a, testList.getFirst());
		assertEquals(c, testList.getLast());
		assertEquals(a, testList.getLast().getPrevious());
		assertEquals(c, testList.getFirst().getNext());
	}
}
