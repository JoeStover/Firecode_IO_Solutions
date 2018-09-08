package UniqueCharsInString;
import java.util.*;
/**
 * Unique Chars in a String
 * 
 * Write a method that takes in an input String and returns true if all the characters 
 * in the String are unique and false if there is even a single repeated character.
 *
 * The method should return true if the input is null or empty String.
 * 
 * Examples:
 * 
 * areAllCharactersUnique("abcde") -> true
 * areAllCharactersUnique("aa") -> false
 * areAllCharactersUnique("") -> true
 * areAllCharactersUnique(null) -> true
 * 
 * @author Joe
 * @version 09/06/2018
 */
public class Main 
{
	public static boolean areAllCharactersUnique(String str)
	{
	    boolean hasUnique = true;
	    if(str != null)
	    {
	    	Set<Character> sifter = new HashSet<Character>();
		    for(int i = 0; i < str.length() && hasUnique; i++) 
		    {
		    	hasUnique = sifter.add(str.charAt(i));
		    }
	    }
	    return hasUnique;
	}
}
