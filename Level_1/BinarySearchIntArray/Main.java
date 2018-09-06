package BinarySearchIntArray;

/**
 * Binary Search on Array of Integers
 * 
 * Write a method that searches an Array of integers for a given integer using the
 * Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
 *
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
 *{} -> [Empty] Array 
 *
 * @author Joe
 * @version 09/04/2018
 */
public class Main 
{
	public static Boolean binarySearch(int[] arr, int n)
	{
		boolean found = false;
		if(arr != null && arr.length != 0)
		{
			int start = 0;
			int end = arr.length - 1;
			while(start <= end && !found)
			{
				int mid = (end - start) / 2;
				if(arr[mid] == n)
				{
					found = true;
				}
				else if(n < arr[mid])
				{
					end = mid;
				}
				else
				{
					start = mid;
				}
			}
		}
		return found;
	}
}
