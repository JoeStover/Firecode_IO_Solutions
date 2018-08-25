package ReplaceAllSpaces;

/**
 * Write a method to replace all spaces in a string with a given replacement 
 * string.replace("This is a test","/") --> "This/is/a/test"
 * 
 * Note: Avoid using the in-built String.replaceAll() method.
 * 
 * @author Joe
 * @version 08/25/2018
 */
public class Main 
{
	public static String replace(String a, String b)
	{
		String result = "";
		for(char c : a.toCharArray())
		{
			result += (c == ' ') ? b : c;
		}
		return result;
	}
}
