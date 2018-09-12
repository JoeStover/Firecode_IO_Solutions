package TransposeSquareMatrix;

/**
 * You are given a square 2D image matrix where each integer represents a pixel.
 * Write a method transposeMatrix to transform the matrix into its Transpose - in-place. 
 * 
 * Example:
 * 
 *  Input image :
 *  1 0
 *  1 0
 *  
 *  Modified to :
 *  1 1
 *  0 0
 * 
 * @author Joe
 * @version 09/10/2018
 */
public class Main 
{
	public static void transposeMatrix(int[][] matrix) 
	{
	    for(int row = 0; row < matrix.length; row++)
	    {
	    	for(int col = row + 1; col < matrix[row].length; col++)
	    	{
	    		int temp = matrix[row][col];
	    		matrix[row][col] = matrix[col][row];
	    		matrix[col][row] = temp;
	    	}
	    }
	}
}
