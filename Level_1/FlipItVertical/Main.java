package FlipItVertical;

/**
 * Flip it!
 * 
 * You are given an m x n 2D image matrix where each integer represents a pixel. 
 * Flip it in-place along its vertical axis.
 * 
 * Example:
 * 
 * Input image :  
 *            1 0
 *            1 0
 *            
 * Modified to :   
 *            0 1
 *            0 1
 * 
 * @author Joe
 * @version 09/05/2018
 */
public class Main 
{
	public static void flipItVerticalAxis(int[][] matrix)
	{
	    for(int[] row : matrix)
	    {
	    	int start = 0;
	    	int end = row.length - 1;
	    	while(start < end)
	    	{
	    		int temp = row[start];
	    		row[start++] = row[end];
	    		row[end--] = temp;
	    	}
	    }
	}
}
