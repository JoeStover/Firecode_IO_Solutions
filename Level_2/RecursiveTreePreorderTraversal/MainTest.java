package RecursiveTreePreorderTraversal;

import DataStructures.TreeNode;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{
	TreeNode root;
	Main testObj;
	@Before
	public void setUp() throws Exception 
	{
		root = null;
		testObj = new Main();
	}

	@Test
	public void testOne() 
	{
		root = null;
		testObj.preorder(root);
		assertEquals("[]", testObj.preorderedList.toString());
	}
	
	@Test
	public void testTwo() 
	{
		root = new TreeNode(6);
		testObj.preorder(root);
		assertEquals("[6]", testObj.preorderedList.toString());
	}

	@Test
	public void testThree() 
	{
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(9);
		testObj.preorder(root);
		assertEquals("[6, 4, 3, 8, 9]", testObj.preorderedList.toString());
	}
	
	@Test
	public void testFour() 
	{
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(10);
		testObj.preorder(root);
		assertEquals("[4, 2, 8, 5, 10]", testObj.preorderedList.toString());
	}
	
	@Test
	public void testFive() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		testObj.preorder(root);
		assertEquals("[1, 2, 4, 5, 3, 6, 7]", testObj.preorderedList.toString());
	}
}
