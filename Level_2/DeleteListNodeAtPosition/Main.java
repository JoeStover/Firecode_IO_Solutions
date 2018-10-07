package DeleteListNodeAtPosition;

import DataStructures.ListNode;

/**
 * Delete the Node at a Particular Position in a Linked List
 * 
 * Given a singly-linked list, implement a method to delete the node at a given 
 * position (starting from 1 as the head position) and return the head of the 
 * list. Do nothing if the input position is out of range.
 * 
 * Examples:
 * 
 * LinkedList: 1->2->3->4 , Head = 1
 * 
 * deleteAtMiddle(Head,3) ==> 1->2->4
 * 
 * @author Joe
 * @version 09/15/2018
 */
public class Main 
{
	public ListNode deleteAtMiddle(ListNode head, int position) 
	{
		if(position == 1 && head != null)
		{
			head = head.next;
		}
		else	
		{
			ListNode prev = null;
			ListNode temp = head;
			while(temp != null && position > 1)
			{
				prev = temp;
				temp = temp.next;
				position--;
			}
			if(position == 1 && temp != null)
			{
				prev.next = temp.next;
				temp.next = null;
			}
		}
		return head;
	}
}
