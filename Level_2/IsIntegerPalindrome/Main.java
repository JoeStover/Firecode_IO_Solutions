package IsIntegerPalindrome;

/**
 * Is this Integer a Palindrome?
 * 
 * Write a method that checks if a given integer is a palindrome - 
 * without allocating additional heap space 
 * 
 * Examples:
 * 
 * -1 ==> false
 * 0 ==> true
 * 1221 ==> true
 * 
 * @author Joe
 * @version 09/15/2018
 */
public class Main 
{
	public static Boolean isIntPalindrome(int x) 
	{            
	    int result = 0;
	    int original = x;
	    while(x > 0)
	    {
	    	result = (result * 10) + (x % 10);
	    	x /= 10;
	    }
	    return result == original;
	}
}
