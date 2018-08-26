package HorizontalFlip;

/**
 * Horizontal Flip
 * 
 * You are given an m x n 2D image matrix where each integer represents a pixel. 
 * Flip it in-place along its horizontal axis.
 * 
 * Example:
 * 
 * Input image :  
 *             1 1
 *             0 0
 *             
 *             
 * Modified to :   
 *             0 0
 *             1 1
 *             
 * @author Joe
 * @version 08/26/2018
 */
public class Main 
{
	public static void flipHorizontalAxis(int[][] matrix) 
	{
	    int firstRow = 0;
	    int lastRow = matrix.length - 1;
	    while(firstRow < lastRow)
	    {
	    	for(int col = 0; col < matrix[0].length; col++)
	    	{
	    		int temp = matrix[firstRow][col];
	    		matrix[firstRow][col] = matrix[lastRow][col];
	    		matrix[lastRow][col] = temp;
	    	}
	    	firstRow++;
	    	lastRow--;
	    }
	}
}
