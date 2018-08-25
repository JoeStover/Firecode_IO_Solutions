package LinkedListInsertAtTail;
import DataStructures.*;

/**
 * Insert a Node at the End of a Linked List 
 * 
 * Write a method to insert a node at the end of a singly-linked list. 
 * Return the head of the modified list.
 * 
 * Examples:
 * 
 * LinkedList: 1->2 , Head = 1
 * 
 * InsertAtTail(Head,1) ==> 1->2->1
 * InsertAtTail(Head,2) ==> 1->2->2
 * InsertAtTail(Head,3) ==> 1->2->3
 * 
 * @author Joe
 * @version 08/25/2018
 */
public class Main 
{
	public ListNode insertAtTail(ListNode head, int data) 
	{
	    if(head != null)
	    {
	    	ListNode temp = head;
		    while(temp.next != null)
		    {
		    	temp = temp.next;
		    }
		    temp.next = new ListNode(data);
	    }
	    else
	    {
	    	head = new ListNode(data);
	    }
		return head;
	}
}
