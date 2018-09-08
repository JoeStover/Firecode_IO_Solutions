package InsertNodeAtFrontOfLinkedList;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import DataStructures.ListNode;

public class MainTest 
{
	ListNode head;
	Main testObj;
	@Before
	public void setup()
	{
		head = null;
		testObj = new Main();
	}
	
	@Test
	public void testOne() 
	{
		head = testObj.insertAtHead(head, 1);
		assertEquals("1", ListNode.printList(head));
	}
	
	@Test
	public void testTwo() 
	{
		head = testObj.insertAtHead(head, 2);
		assertEquals("2->1", ListNode.printList(head));
	}
	
	@Test
	public void testThree() 
	{
		head = testObj.insertAtHead(head, 3);
		assertEquals("3->2->1", ListNode.printList(head));
	}

}
