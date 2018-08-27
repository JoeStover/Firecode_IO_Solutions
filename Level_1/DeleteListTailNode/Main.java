package DeleteListTailNode;

import DataStructures.ListNode;

/**
 * Delete a List's Tail Node
 * 
 * Given a singly-linked list, write a method to delete its last node and 
 * return the head. 
 * 
 * Example: 1->2->3->4 ==> 1->2->3
 * 
 * @author Joe
 * @version 08/26/2018
 */
public class Main 
{
	public ListNode deleteAtTail(ListNode head) 
	{
        ListNode temp = head;
        if(head == null || head.next == null)
        {
        	head = null;
        }
        else
        {
        	while(temp.next.next != null)
        	{
        		temp = temp.next;
        	}
        	temp.next = null;
        }
        return head;	    
	}
}
