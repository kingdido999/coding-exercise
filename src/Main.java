import org.junit.Test;

import ch1.*;
import ch2.*;
import static org.junit.Assert.*;

public class Main {

	@Test
	public void testHasUniqueChars() {
		HasUniqueChars t = new HasUniqueChars();

		assertTrue(t.hasUniqueChars("abc"));
		assertFalse(t.hasUniqueChars("abcc"));
	}

	@Test
	public void testReplaceString() {
		ReplaceString t = new ReplaceString();

		assertEquals(
			t.replaceString("Mr John Smith    ", 13), 
			"Mr%20John%20Smith"
			);
	}

	@Test
	public void testCompressString() {
		CompressString t = new CompressString();

		assertEquals(
			t.compressString("aabcccccaaa"), 
			"a2b1c5a3"
			);
	}

	@Test
	public void testNodeSize() {
		Node<Object> n = new Node<Object>(new Object[]{1, 2, 3});

		assertEquals(n.size(), 3);
	}

	@Test
	public void testNodeEquals() {
		Node<Object> p = new Node<Object>(new Object[]{1, 2, 3});
		Node<Object> q = new Node<Object>(new Object[]{1, 2, 3});
		Node<Object> r = new Node<Object>(new Object[]{2, 2, 3});

		assertTrue(p.equals(q));
		assertFalse(p.equals(r));
	} 

	@Test
	public void testRemoveDuplicates() {
		RemoveDuplicates t = new RemoveDuplicates();
		Node<Object> head = new Node<Object>(new Object[]{1, 2, 1, 2, 3});
		Node<Object> expected = new Node<Object>(new Object[]{1, 2, 3});

		assertTrue(t.removeDuplicates(head).equals(expected));
	}

	@Test
	public void testDeleteMiddleNode() {
		DeleteMiddleNode t = new DeleteMiddleNode();
		Node<Object> head = new Node<Object>(new Object[]{"a", "b", "c", "d", "e"});
		Node<Object> middle = head.next().next();
		Node<Object> expected = new Node<Object>(new Object[]{"a", "b", "d", "e"});

		t.deleteMiddleNode(middle);

		assertTrue(head.equals(expected));
	}

	@Test
	public void testFromKtoLast() {
		FromKtoLast t = new FromKtoLast();
		Node<Object> head = new Node<Object>(new Object[]{1, 2, 3, 4});
		int k = 2;
		Node<Object> expected = new Node<Object>(new Object[]{3, 4});

		assertTrue(t.fromKtoLast(head, k).equals(expected));
	}
}