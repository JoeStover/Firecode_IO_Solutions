package DeleteListNodeAtPosition;

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
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		head = testObj.deleteAtMiddle(head,  6);
		assertEquals("1->2->3->4", ListNode.printList(head));
	}
	
	@Test
	public void testTwo() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		head = testObj.deleteAtMiddle(head,  3);
		assertEquals("1->2->4", ListNode.printList(head));
	}
	
	@Test
	public void testThree() 
	{
		head = null;
		
		head = testObj.deleteAtMiddle(head,  2);
		assertEquals("", ListNode.printList(head));
	}
	
	@Test
	public void testFour() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		head = testObj.deleteAtMiddle(head,  4);
		assertEquals("1->2->3", ListNode.printList(head));
	}
	
	@Test
	public void testFive() 
	{
		head = new ListNode(1);
		
		head = testObj.deleteAtMiddle(head,  1);
		assertEquals("", ListNode.printList(head));
	}
	
	@Test
	public void testSix() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		head = testObj.deleteAtMiddle(head,  1);
		assertEquals("2->3->4", ListNode.printList(head));
	}
	
}
