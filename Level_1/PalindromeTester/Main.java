package PalindromeTester;

/**
 * Palindrome Tester
 * 
 * A palindrome is a string or sequence of characters that reads the same 
 * backward as forward. For example, "madam" is a palindrome. Write a method 
 * that takes in a String and returns a boolean -> true if the input String 
 * is a palindrome and false if it is not. An empty string and a null input 
 * are considered palindromes. You also need to account for the space 
 * character. For example, "race car" should return false as read backward 
 * it is "rac ecar".
 * 
 * 
 * Examples:
 * 
 * isStringPalindrome("madam") -> true
 * isStringPalindrome("aabb") -> false
 * isStringPalindrome("race car") -> false
 * isStringPalindrome("") -> true
 * isStringPalindrome(null) -> true
 * 
 * @author Joe
 * @version 08/29/2018
 */
public class Main 
{
	// iterative solution
	public static boolean isStringPalindrome(String str)
	{
		boolean isPali = true;
		if(str != null && !str.isEmpty())
		{
			int first = 0;
			int last = str.length() - 1;
			while(first <= last && isPali)
			{
				isPali = str.charAt(first++) == str.charAt(last--);
			}
		}
		return isPali;
	}
	
	// recursive solution
	public static boolean isPaliRecursive(String str)
	{
		if(str == null || str.length() < 2)
		{
			return true;
		}
		return (str.charAt(0) == str.charAt(str.length() - 1)) ? 
				isPaliRecursive(str.substring(1, str.length() - 1)) : false;
	}
}
