package RepeatedArrayElements;

import java.util.*;
/**
 * Repeated Elements in an Array 
 * 
 * Write a method duplicate to find the repeated or duplicate elements in an 
 * array. This method should return a list of repeated integers in a string 
 * with the elements sorted in ascending order (as illustrated below). 
 * 
 * Examples:
 * 
 * 
 * @author Joe
 * @version 09/04/2018
 */
public class Main 
{
	public static String duplicate(int[] numbers)
	{
		String result = "";
	    Arrays.sort(numbers);
	    Set<Integer> dupes = new TreeSet<Integer>();
	    for(int i = 1; i < numbers.length; i++)
	    {
	        if(numbers[i - 1] == numbers[i])
	        {
	            dupes.add(numbers[i]);
	        }
	    }
	    for(int num : dupes)
	    {
	    	result += num + ", ";
	    }
	    return (result.isEmpty()) ? result :
	    	"[" + result.substring(0, result.length() - 2) + "]";
	}
}
