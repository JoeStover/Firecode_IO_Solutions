package FindListMiddleInSinglePass;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import DataStructures.*;
public class MainTest 
{
	ListNode head;
	Main testObj;
	@Before
	public void setUp() throws Exception 
	{
		head = null;
		testObj = new Main();
	}

	@After
	public void tearDown() throws Exception 
	{
	
	}

	/**
	 * Input:  1->2
	 * Output: 1
	 */
	@Test
	public void testOne() 
	{
		head = new ListNode(1);
		head.next = new ListNode(2);
		assertEquals(1, testObj.findMiddleNode(head).data);
	}
	
	/**
	 * Input:  null
	 * Output: null
	 */
	@Test
	public void testTwo() 
	{
		head = null;
		assertNull(testObj.findMiddleNode(head));
	}
	
	/** 
	 * Input:  1->2->3->4
	 * Output: 2
	 */
	@Test
	public void testThree() 
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		assertEquals(2, testObj.findMiddleNode(head).data);
	}
	
	/**
	 * Input:  1
	 * Output: 1
	 */
	@Test
	public void testFour() 
	{
		ListNode head = new ListNode(1);
		assertEquals(1, testObj.findMiddleNode(head).data);
	}
	
	/**
	 * Input:  1->2->3->4->5
	 * Output: 3
	 */
	@Test
	public void testFive() 
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		assertEquals(3, testObj.findMiddleNode(head).data);
	}

}
