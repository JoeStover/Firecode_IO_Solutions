package TransposeSquareMatrix;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		int[][] matrix = {{1}};
		Main.transposeMatrix(matrix);
		assertEquals("[[1]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testTwo() 
	{
		int[][] matrix = {{1, 0, 1}, {1, 0, 1}, {1, 0, 1}};
		Main.transposeMatrix(matrix);
		assertEquals("[[1, 1, 1], [0, 0, 0], [1, 1, 1]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testThree() 
	{
		int[][] matrix = {{1, 0}, {0, 0}};
		Main.transposeMatrix(matrix);
		assertEquals("[[1, 0], [0, 0]]", Arrays.deepToString(matrix));
	}
	
	@Test
	public void testFour() 
	{
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Main.transposeMatrix(matrix);
		assertEquals("[[1, 4, 7], [2, 5, 8], [3, 6, 9]]", Arrays.deepToString(matrix));
	}
}
