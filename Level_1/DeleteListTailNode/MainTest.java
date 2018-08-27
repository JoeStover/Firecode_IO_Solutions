package DeleteListTailNode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataStructures.ListNode;

public class MainTest 
{
	ListNode head;
	Main tester;
	@Before
	public void setUp() throws Exception 
	{
		tester = new Main();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/**
	 * Input:  LinkedList: 1->2
	 * Output: 1
	 */
	@Test
	public void testOne() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head = tester.deleteAtTail(head);
		assertEquals("1", ListNode.printList(head));
	}
	
	/**
	 * Input:  LinkedList: 1
	 * Output: null
	 */
	@Test
	public void testTwo() 
	{
		head = new ListNode(1);
		head = tester.deleteAtTail(head);
		assertNull(head);
	}
	
	/**
	 * Input:  LinkedList: 1->2->3->4
	 * Output: 1->2->3
	 */
	@Test
	public void testThree() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head = tester.deleteAtTail(head);
		assertEquals("1->2->3", ListNode.printList(head));
	}
	
	/**
	 * Input:  LinkedList: null
	 * Output: null
	 */
	@Test
	public void testFour() 
	{
		head = null;
		head = tester.deleteAtTail(head);
		assertNull(head);
	}
}
