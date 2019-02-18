import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
	
	@Test
	public void testAdd() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		assertTrue(tree.add(2));
		assertFalse(tree.add(2));
		assertTrue(tree.add(3));
		assertTrue(tree.add(1));
		assertTrue(tree.add(24));
	}
	
	@Test
	public void testSearch() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		assertTrue(tree.add(2));
		assertFalse(tree.add(2));
		assertTrue(tree.add(3));
		assertTrue(tree.add(1));
		assertTrue(tree.add(24));
		//System.out.println(tree.search(4));
		assertEquals(Integer.valueOf(3), tree.search(3).getValue());
		assertNull(tree.search(4));
	}
	
	@Test
	public void testRemove() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		assertTrue(tree.add(2));
		assertFalse(tree.add(2));
		assertTrue(tree.add(3));
		assertTrue(tree.add(1));
		assertTrue(tree.add(24));
		assertTrue(tree.remove(3));
		assertFalse(tree.remove(3));
		assertTrue(tree.remove(24));
		assertTrue(tree.add(24));
	}

}
