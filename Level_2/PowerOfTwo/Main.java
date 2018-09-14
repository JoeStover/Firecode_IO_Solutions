package PowerOfTwo;

/**
 * Power of 2
 * 
 * Write a method - isPowOfTwo to test whether or not a given positive integer 
 * is a power of 2. Your method should run in constant O(1) time and use O(1) space.
 * 
 * Examples:
 * 
 * isPowOfTwo(5) ==> false
 * isPowOfTwo(8) ==> true
 * 
 * @author Joe
 * @version 09/13/2018
 */
public class Main 
{
	public static boolean isPowOfTwo(int num) 
	{
	    return num % 2 == 0 || num == 1;
	}
}
