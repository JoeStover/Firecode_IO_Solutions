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
		while(temp != null)
		{
			result += temp.data;
			if(temp.next != null)
			{
				result += "->";
			}
			temp = temp.next;
		}
		return result;
	}
}
