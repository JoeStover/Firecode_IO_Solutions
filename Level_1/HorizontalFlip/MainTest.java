package HorizontalFlip;

import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/**
	 * Test Input:	{{1}}
	 * Test Output: {{1}}
	 */
	@Test
	public void testOne() 
	{
		int[][] matrix = {{1}};
		Main.flipHorizontalAxis(matrix);
		assertEquals("[[1]]", Arrays.deepToString(matrix));
	}
	
	/**
	 * Test Input:	{{1,0,0}{0,0,1}}
	 * Test Output: {{0,0,1},{1,0,0}}
	 */
	@Test
	public void testTwo() 
	{
		int[][] matrix = {{1,0,0},{0,0,1}};
		Main.flipHorizontalAxis(matrix);
		assertEquals("[[0, 0, 1], [1, 0, 0]]", Arrays.deepToString(matrix));
	}
	
	/**
	 * Test Input:	{{1,0}}
	 * Test Output: {{1,0}}
	 */
	@Test
	public void testThree() 
	{
		int[][] matrix = {{1,0}};
		Main.flipHorizontalAxis(matrix);
		assertEquals("[[1, 0]]", Arrays.deepToString(matrix));
	}
	
	/**
	 * Test Input:	{{1,2,3},{4,5,6},{7,8,9}}
	 * Test Output: {{7,8,9},{4,5,6},{1,2,3}}
	 */
	@Test
	public void testFour() 
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Main.flipHorizontalAxis(matrix);
		assertEquals("[[7, 8, 9], [4, 5, 6], [1, 2, 3]]", Arrays.deepToString(matrix));
	}
	
	/**
	 * Test Input:	{{1,0,1},{1,0,1}}
	 * Test Output: {{1,0,1},{1,0,1}}
	 */
	@Test
	public void testFive() 
	{
		int[][] matrix = {{1,0,1},{1,0,1}};
		Main.flipHorizontalAxis(matrix);
		assertEquals("[[1, 0, 1], [1, 0, 1]]", Arrays.deepToString(matrix));
	}
}
