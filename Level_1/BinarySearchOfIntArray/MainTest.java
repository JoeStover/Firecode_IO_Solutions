package BinarySearchOfIntArray;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		int[] arr = {2,5,7,8,9};
		assertTrue(Main.binarySearch(arr, 9));
	}
	
	@Test
	public void testTwo() 
	{
		int[] arr = {2,8,9,12};
		assertFalse(Main.binarySearch(arr, 6));
	}
	
	@Test
	public void testThree() 
	{
		int[] arr = {2};
		assertFalse(Main.binarySearch(arr, 4));
	}
	
	@Test
	public void testFour() 
	{
		int[] arr = {};
		assertFalse(Main.binarySearch(arr, 9));
	}
	
	@Test
	public void testFive() 
	{
		int[] arr = new int [0];
		assertFalse(Main.binarySearch(arr, 9));
	}

}