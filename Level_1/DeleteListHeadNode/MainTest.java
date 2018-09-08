package DeleteListHeadNode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import DataStructures.ListNode;

public class MainTest 
{
	Main testObj;
	ListNode head;
	@Before
	public void setUp() throws Exception 
	{
		testObj = new Main();
		head = null;
	}

	@Test
	public void testOne() 
	{
		head = new ListNode(1);
		assertNull(testObj.deleteAtHead(head));
	}
	
	@Test
	public void testTwo() 
	{
		head = null;
		assertNull(testObj.deleteAtHead(head));
	}
	
	@Test
	public void testThree() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head = testObj.deleteAtHead(head);
		assertEquals("2->3->4", ListNode.printList(head));
	}
	
	@Test
	public void testFour() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head = testObj.deleteAtHead(head);
		assertEquals("2", ListNode.printList(head));
	}

}
