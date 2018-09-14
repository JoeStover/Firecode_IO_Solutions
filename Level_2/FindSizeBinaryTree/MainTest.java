package FindSizeBinaryTree;

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
		root = null;
		testObj = new Main();
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
		
		assertEquals(7, testObj.size(root));
	}
	
	@Test
	public void testTwo() 
	{
		root = new TreeNode(4);
		root.left = new TreeNode(5);
		root.right = new TreeNode(6);
		
		assertEquals(3, testObj.size(root));
	}
	
	@Test
	public void testThree() 
	{
		root = new TreeNode(4);
		
		assertEquals(1, testObj.size(root));
	}
	
	@Test
	public void testFour() 
	{
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(10);
		
		assertEquals(5, testObj.size(root));
	}
	
	@Test
	public void testFive() 
	{
		root = null;
		
		assertEquals(0, testObj.size(root));
	}
	
	@Test
	public void testSix() 
	{
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(7);
		
		assertEquals(5, testObj.size(root));
	}
	
	

}
