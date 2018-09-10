package IterativePreorderTreeTraversal;

import DataStructures.TreeNode;
import java.util.*;

/**
 * Iterative Preorder Traversal
 * 
 * Given a binary tree, write a method to iteratively traverse the tree in the 
 * preorder manner. Mark a node as visited by adding its data to a list - 
 * Arraylist <Integer> preorderedList. Return this list.
 * 
 * Example:  
 *     1
 *    / \
 *   2   3     ==> 1245367
 *  / \ / \
 * 4  5 6  7 
 * 
 * @author Joe
 * @version 09/08/2018
 */
public class Main 
{
	public ArrayList<Integer> preorderItr(TreeNode root) 
	{
		ArrayList<Integer> preList = new ArrayList<Integer>();
		Stack<TreeNode> preStack = new Stack<TreeNode>();
		TreeNode node = root;
		if(node != null)
		{
			preStack.push(node);
			while(!preStack.isEmpty())
			{
				node = preStack.pop();
				preList.add(node.data);
				if(node.right != null)
				{
					preStack.push(node.right);
				}
				if(node.left != null)
				{
					preStack.push(node.left);
				}
			}
		}	
		return preList;
	}
}
