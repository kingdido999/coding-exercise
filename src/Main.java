import org.junit.Test;
import static org.junit.Assert.*;

import extra.*;
import ch1.*;
import ch2.*;
import ch11.*;

public class Main {

	@Test
	public void testReverse() {
		Reverse t = new Reverse();
		String s = "Madam, I'm Adam";
		String expected = "madA m'I ,madaM";

		assertEquals(t.reverse(s), expected);
	}

	@Test
	public void testFibRecursive() {
		Fib t = new Fib();
		int n1 = 1;
		int n2 = 8;
		int expected1 = 1;
		int expected2 = 21;

		assertEquals(t.fib(n1), expected1);
		assertEquals(t.fib(n2), expected2);
	}

	@Test
	public void testFibNonRecursive() {
		Fib t = new Fib();
		int n1 = 1;
		int n2 = 8;
		int expected1 = 1;
		int expected2 = 21;

		assertEquals(t.fib2(n1), expected1);
		assertEquals(t.fib2(n2), expected2);
	}

	// @Test
	// public void testSumFile() {
	// 	SumFile t = new SumFile();
	// 	String filename = "file.txt";
	// 	int expected = 1 + 2 + 3 + 4 + 5;

	// 	assertEquals(t.sumFile(filename), expected);
	// }

	@Test
	public void testLargest() {
		Largest t = new Largest();
		int[] input = {1, 2, 3, 4, 5};
		int expected = 5;

		assertEquals(t.largest(input), expected);
	}

	@Test
	public void testFormatRGB() {
		FormatRGB t = new FormatRGB();
		int r = 255, g = 255, b = 255;
		String expected = "FFFFFF";

		assertEquals(t.formatRGB(r, g, b), expected);
	}

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
	public void testIsPermutation() {
		IsPermutation t = new IsPermutation();

		assertTrue(t.isPermutation("abcdef", "fedcba"));
		assertFalse(t.isPermutation("abc", "abb"));
		assertFalse(t.isPermutation("abcc", "abc"));
	}

	@Test
	public void testPermutationSolution() {
		IsPermutation t = new IsPermutation();

		assertTrue(t.permutation("abcdef", "fedcba"));
		assertFalse(t.permutation("abc", "abb"));
		assertFalse(t.permutation("abcc", "abc"));
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
		Node<Object> expected1 = new Node<Object>(new Object[]{3, 4});
		Node<Object> expected2 = new Node<Object>(new Object[]{1, 2, 3, 4});

		assertTrue(t.fromKtoLast(head, 2).equals(expected1));
		assertTrue(t.fromKtoLast(head, 0).equals(expected2));
		assertNull(t.fromKtoLast(head, 4));
	}

	@Test
	public void testMerge() {
		Merge t = new Merge();
		int[] a = new int[8];
		int[] b = {2, 3, 4};
		int[] expected = {1, 2, 2, 3, 3, 4, 4, 5};
		int lastA = 5;
		int lastB = 3;

		// a = {1, 2, 3, 4, 5, null, null, null}
		for (int i = 0; i < lastA; i++) {
			a[i] = i + 1;
		}

		assertArrayEquals(t.merge(a, b, lastA, lastB), expected);
	}

	@Test
	public void testFindString() {
		FindString t = new FindString();
		String[] a = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String str = "ball";
		int start = 0;
		int end = a.length - 1;
		int expected = 4;

		assertEquals(t.findString(str, a, start, end), expected);
	}

	@Test
	public void testSearchMatrix() {
		SearchMatrix t = new SearchMatrix();
		int[][] m = {
			{15, 20, 40, 85},
			{20, 35, 80, 95},
			{30, 55, 95, 105},
			{40, 80, 100, 120}
		};

		int elem = 55;

		Tuple<Integer, Integer> result = t.searchMatrix(m, elem);
		Tuple<Integer, Integer> expected = new Tuple<Integer, Integer>(2, 1);

		assertEquals(result.x, expected.x);
		assertEquals(result.y, expected.y);
	}


}
