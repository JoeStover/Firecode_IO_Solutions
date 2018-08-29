package FindListMiddleInSinglePass;
import DataStructures.*;
/**
 * Find the Middle of a List in a Single Pass
 * 
 * Given a Singly-Linked List, write a method - findMiddleNode that finds and 
 * returns the middle node of the list in a single pass.
 * 
 * Examples:
 * 
 * 1 ==> 1
 * 1->2 ==> 1
 * 1->2->3->4 ==> 2
 * 1->2->3->4->5 ==> 3
 * 
 * @author Joe
 * @version 08/28/2018
 */
public class Main 
{
	public ListNode findMiddleNode(ListNode head) 
	{
		ListNode slow = head;
		ListNode fast = (head == null || head.next == null) ? null: head.next.next;
		while(slow != null && fast != null)
		{
			slow = slow.next;
			fast = (fast.next == null) ? null: fast.next.next;
		}
		return slow;
	}
}
