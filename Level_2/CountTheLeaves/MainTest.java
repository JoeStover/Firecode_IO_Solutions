package CountTheLeaves;

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
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		
		assertEquals(1, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testTwo() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		assertEquals(4, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testThree() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		assertEquals(5, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testFour() 
	{
		root = null;
		
		assertEquals(0, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testFive() 
	{
		root = new TreeNode(6);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(9);
		
		assertEquals(2, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testSix() 
	{
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(10);
		
		assertEquals(3, testObj.numberOfLeaves(root));
	}

	@Test
	public void testSeven() 
	{
		root = new TreeNode(1);
		
		assertEquals(1, testObj.numberOfLeaves(root));
	}
	
	@Test
	public void testEight() 
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		assertEquals(2, testObj.numberOfLeaves(root));
	}

}
