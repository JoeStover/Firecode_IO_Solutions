package BinaryRepresentation;

/**
 * Binary Representation
 * 
 * Write a method to compute the binary representation of a positive integer. 
 * The method should return a string with 1s and 0s. 
 * 
 * computeBinary(6) ==> "110"
 * computeBinary(5) ==> "101"
 * 
 * Note: Use the minimum number of binary digits needed for the representation 
 *       (Truncate unnecessary trailing 0s).
 * 
 * computeBinary(5) ==> "0101" (incorrect)
 * computeBinary(5) ==> "101" (correct)
 * 
 * @author Joe
 * @version 09/13/2018
 */
public class Main 
{
	public static String computeBinary(int val) 
	{
		String bin = "";
		while(val > 0)
		{
			bin = val % 2 + bin;
			val = val / 2;
		}
		return (bin.isEmpty()) ? "0" : bin;
	}
}
