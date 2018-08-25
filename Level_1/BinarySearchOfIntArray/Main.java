package BinarySearchOfIntArray;
import java.util.Arrays;

/**
 * Binary Search on Array of Integers 
 * 
 * Write a method that searches an Array of integers for a given integer using the
 * Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
 * You can assume that the given array of integers is already sorted
 * in ascending order.
 *
 * Examples:
 *
 * binarySearch({2,5,7,8,9},9) -> true
 *
 * binarySearch({2,8,9,12},6) -> false
 * 
 * binarySearch({2},4) -> false
 *
 * binarySearch({},9) -> false
 *
 * {} -> [Empty] Array 
 *
 *
 * @author Joe
 * @version 08/25/2018
 */
public class Main 
{
	public static Boolean binarySearch(int[] arr, int n)
	{
		int first = 0;
		int last = arr.length - 1;
		while(first <= last)
		{
			int targetIndex = (last + first) / 2;
			if(arr[targetIndex] == n)
			{
				return true;
			}
			else if(arr[targetIndex] < n)
			{
				first = targetIndex + 1;
			}
			else
			{
				last = targetIndex - 1;
			}
		}
		return false;
	}
	public static Boolean binarySearchCheat(int[] arr, int n)
	{
		// of course, you could just use the Java API
		return Arrays.binarySearch(arr, n) >= 0;
	}
}
