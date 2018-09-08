package InsertNodeAtFrontOfLinkedList;

import DataStructures.ListNode;

/**
 * Insert a Node at the Front of a Linked List
 * 
 * Write a method to insert a node at the front of a singly-linked list and return 
 * the head of the modified list. 
 * 
 * Examples:
 * 
 * LinkedList: 1->2 , Head = 1
 * 
 * InsertAtHead(Head,1) ==> 1->1->2
 * InsertAtHead(Head,2) ==> 2->1->2
 * InsertAtHead(Head,3) ==> 3->1->2
 * 
 * @author Joe
 * @version 09/05/2018
 */
public class Main 
{
	public ListNode insertAtHead(ListNode head, int data) 
	{
		ListNode node = new ListNode(data);
		node.next = head;
		return node;
	}
}
