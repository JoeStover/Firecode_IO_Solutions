package DeleteListHeadNode;

import DataStructures.ListNode;

/**
 * Delete a List's Head Node
 * 
 * Given a singly-linked list, write a method to delete the first node of the 
 * list and return the new head.
 * 
 * Example:
 * 
 * LinkedList: 1->2->3 , Head = 1
 * 
 * deleteAtHead(Head) ==> 2->3
 *  
 * @author Joe
 * @version 09/06/2018
 */
public class Main 
{
	public ListNode deleteAtHead(ListNode head) 
	{
	    return (head == null) ? null : head.next;
	}
}
