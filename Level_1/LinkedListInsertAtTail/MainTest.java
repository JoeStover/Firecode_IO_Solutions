package LinkedListInsertAtTail;
import DataStructures.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{
	Main object;
	ListNode head;
	
	@Before
	public void setup()
	{
		object = new Main();
		head = null;
	}
	
	@Test
	public void testOne() 
	{
		head = object.insertAtTail(head, 1);
		assertEquals("1", ListNode.printList(head));
	}
	
	@Test
	public void testTwo() 
	{
		head = new ListNode(1);
		head = object.insertAtTail(head, 2);
		assertEquals("1->2", ListNode.printList(head));
	}
	
	@Test
	public void testThree() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head = object.insertAtTail(head, 3);
		assertEquals("1->2->3", ListNode.printList(head));
	}
}
