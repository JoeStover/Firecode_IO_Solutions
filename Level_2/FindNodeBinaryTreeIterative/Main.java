package FindNodeBinaryTreeIterative;

import DataStructures.TreeNode;
import java.util.Stack;

/**
 * Find a Node in a Binary Tree Without Using Recursion
 * 
 * Given a binary tree, write a method to find and return the node 
 * with data = the input data. Do not use recursion. Return null, 
 * if desired node is not found.
 * 
 *    Example:  
 *        1              
 *       / \            
 *      2   3    
 *     / \ / \          
 *    4  5 6  7         
 *    
 *    findNode(root, 5) ==> 5
 * 
 * @author Joe Stover
 * @version 09/11/2018
 */
public class Main 
{
	public TreeNode findNode(TreeNode root, int val) 
	{
	    TreeNode temp = root;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(temp);
    	while(!stack.isEmpty()) 
    	{
    		temp = stack.pop();
    		if(temp != null)
    		{
    			if(temp.data == val)
    			{
    				return temp;
    			}
    			else
    			{
    				stack.push(temp.left);
    				stack.push(temp.right);
    			}
    		}
    	}
	    return null;
	}
}
