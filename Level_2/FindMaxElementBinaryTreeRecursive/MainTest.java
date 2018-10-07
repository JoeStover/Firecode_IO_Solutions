package FindMaxElementBinaryTreeRecursive;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import DataStructures.TreeNode;

public class MainTest 
{
	Main testObj;
	TreeNode root;
	@Before
	public void setUp() throws Exception 
	{
		testObj = new Main();
		root = null;
	}
	
	@Test
	public void testOne() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		assertEquals(7, testObj.findMax(root));
	}
	
	@Test
	public void testTwo() 
	{
		root = new TreeNode(6);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(8);
		root.right = new TreeNode(4);
		
		assertEquals(9, testObj.findMax(root));
	}
	
	@Test
	public void testThree() 
	{
		root = new TreeNode(4);
		
		assertEquals(4, testObj.findMax(root));
	}
	
	@Test
	public void testFour() 
	{
		root = new TreeNode(4);
		root.left = new TreeNode(40);
		root.left.left = new TreeNode(41);
		root.right = new TreeNode(45);
		
		assertEquals(45, testObj.findMax(root));
	}
}
