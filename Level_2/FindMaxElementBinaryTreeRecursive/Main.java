package FindMaxElementBinaryTreeRecursive;

import DataStructures.TreeNode;

/**
 * Find the Max Element in a Binary Tree Recursively
 * 
 * Given a binary tree, write a recursive method to return the maximum element. 
 * 
 * Examples:
 *     
 *        1                
 *       / \             
 *      2   3     ==>  7
 *     / \ / \           
 *    4  5 6  7 
 *    
 * @author Joe
 * @version 09/17/2018
 */
public class Main 
{
	public int findMax(TreeNode root) 
	{
		return (root == null) ? 0 : Math.max(root.data, Math.max(findMax(root.right), findMax(root.left)));
	}
}
