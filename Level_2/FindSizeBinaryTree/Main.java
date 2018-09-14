package FindSizeBinaryTree;

import DataStructures.TreeNode;

/**
 * Find the size of the Binary Tree
 * 
 * Given a binary tree, write a method to return its size. 
 * The size of a tree is the number of nodes it contains. 
 * 
 * Examples: 
 *      1                
 *     / \             
 *    2   3     ==>  7
 *   / \ / \           
 *  4  5 6  7 
 * 
 * @author Joe
 * @version 09/12/2018
 */
public class Main 
{
	public int size(TreeNode root) 
	{
	    return (root == null) ? 0 : size(root.left) + size(root.right) + 1;  
	}
}
