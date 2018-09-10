package DataStructures;

/**
 * Utility class representing a Tree data structure to be used with specific problem
 * sets.
 * 
 * @author Joe
 * @version 09/08/2018
 */
public class TreeNode 
{
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode()
	{
		this.left = null;
		this.right = null;
	}
	public TreeNode(int inData)
	{
		this.data = inData;
		this.left = null;
		this.right = null;
	}
}
