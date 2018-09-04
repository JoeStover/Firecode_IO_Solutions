package ReverseAString;

/**
 * Reverse a string
 * 
 * Write a method that takes in a String and returns the reversed version of the String. 
 * 
 * Examples:
 * 
 * reverseString("abcde") -> "edcba"
 * reverseString("1") -> "1"
 * reverseString("") -> ""
 * reverse("madam") -> "madam"
 * reverse(null) -> null
 * 
 * @author Joe
 * @version 08/29/2018
 */
public class Main 
{
	// super cheap version just using the Java API...
	public static String reverseString(String str)
	{
		return (str == null) ? null : new StringBuilder(str).reverse().toString();
	}
	
	// less "cheap" version
	public static String revStringRecursive(String str)
	{
		if(str == null)
		{
			return null;
		}
		else if(str.isEmpty())
		{
			return "";
		}
		return revStringRecursive(str.substring(1)) + str.charAt(0);
	}
}
