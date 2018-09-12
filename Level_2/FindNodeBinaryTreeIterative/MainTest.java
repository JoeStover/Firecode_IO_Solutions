package FindNodeBinaryTreeIterative;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import DataStructures.TreeNode;

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
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(9);
		assertEquals(4, testObj.findNode(root, 4).data);
	}
	
	@Test
	public void testTwo() 
	{
		root = new TreeNode(1);
		assertNull(testObj.findNode(root, 2));
	}
	
	@Test
	public void testThree() 
	{
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(9);
		assertEquals(8, testObj.findNode(root, 8).data);
	}
	
	@Test
	public void testFour() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(9);
		assertEquals(1, testObj.findNode(root, 1).data);
	}
	
	@Test
	public void testFive() 
	{
		root = null;
		assertNull(testObj.findNode(root, 1));
	}
	
	@Test
	public void testSix() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		assertEquals(5, testObj.findNode(root, 5).data);
	}
}
