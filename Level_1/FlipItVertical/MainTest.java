package FlipItVertical;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		int[][] matrix = {{1,0,0},{0,0,1}};
		Main.flipItVerticalAxis(matrix);
		assertEquals("[[0, 0, 1], [1, 0, 0]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testTwo() 
	{
		int[][] matrix = {{1}};
		Main.flipItVerticalAxis(matrix);
		assertEquals("[[1]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testThree() 
	{
		int[][] matrix = {{1,0}};
		Main.flipItVerticalAxis(matrix);
		assertEquals("[[0, 1]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testFour() 
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Main.flipItVerticalAxis(matrix);
		assertEquals("[[3, 2, 1], [6, 5, 4], [9, 8, 7]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testFive() 
	{
		int[][] matrix = {{1,0,1},{1,0,1}};
		Main.flipItVerticalAxis(matrix);
		assertEquals("[[1, 0, 1], [1, 0, 1]]", Arrays.deepToString(matrix));
	}

}
