package BubbleSort;

/**
 * Bubble Sort
 * 
 * Write a method that takes in an array of ints and uses the Bubble Sort algorithm 
 * to sort the array 'in place' in ascending order. The method should return the same, 
 * in-place sorted array.
 * 
 * Note: Bubble sort is one of the most inefficient ways to sort a large array of integers. 
 * Nevertheless, it is an interview favorite. Bubble sort has a time complexity of O(n2). 
 * However, if the sample size is small, bubble sort provides a simple implementation of a 
 * classic sorting algorithm. 
 * 
 * Examples:
 * 
 * bubbleSortArray({5,4,3}) -> {3,4,5}
 * bubbleSortArray({3}) -> {3}
 * bubbleSortArray({}) -> {}
 * {} -> [Empty] Array 
 * 
 * @author Joe
 * @version 09/05/2018
 */
public class Main 
{
	public static int[] bubbleSortArray(int[] arr)
	{
	    boolean swapped = true;
	    int end = arr.length - 1;
	    while(swapped)
	    {
	    	swapped = false;
	    	for(int start = 1; start <= end; start++)
	    	{
	    		if(arr[start] < arr[start - 1])
	    		{
	    			int temp = arr[start];
	    			arr[start] = arr[start - 1];
	    			arr[start - 1] = temp;
	    			swapped = true;
	    		}
	    	}
	    	end--;
	    }	    
	    return arr;
	}
}
