package DataStructures;
/**
 * Utility class representing a LinkedList to be used with specific problem
 * sets.
 * 
 * @author Joe
 * @version 08/25/2018
 */
public class ListNode 
{
	public int data;
	public ListNode next;
		
	public ListNode(int data)
	{
		this.data = data;
	}
	
	
	public static String printList(ListNode head)
	{
		String result = "";
		ListNode temp = head;
		if(temp != null)
		{
			// do/while covers a circular linked list
			do
			{
				result += temp.data;
				if(temp.next != null)
				{
					result += "->";
				}
				temp = temp.next;
			}
			while(temp != null && temp != head);
		}
		return result;
	}
}
