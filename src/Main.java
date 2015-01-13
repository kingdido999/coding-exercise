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
   		Node n = new Node(1, new Node(2, new Node(3)));

   		assertEquals(n.size(), 3);
   }

   @Test
   public void testNodeEquals() {
   		Node p = new Node(1, new Node(2, new Node(3)));
   		Node q = new Node(1, new Node(2, new Node(3)));
   		Node r = new Node(2, new Node(2, new Node(3)));

   		assertTrue(p.equals(q));
   		assertFalse(p.equals(r));
   } 

	@Test
    public void testRemoveDuplicates() {
         RemoveDuplicates t = new RemoveDuplicates();
         Node head = new Node(1, new Node(2, new Node(1, new Node(2, new Node(3)))));
         Node expected = new Node(1, new Node(2, new Node(3)));

         assertTrue(t.removeDuplicates(head).equals(expected));
   }

	@Test
    public void testDeleteMiddleNode() {
         DeleteMiddleNode t = new DeleteMiddleNode();
         Node head = new Node("a", new Node("b", new Node("c", new Node("d", new Node("e")))));
         Node middle = head.next().next();
         Node expected = new Node("a", new Node("b", new Node("d", new Node("e"))));

         t.deleteMiddleNode(middle);
         
         assertTrue(head.equals(expected));
   }
}