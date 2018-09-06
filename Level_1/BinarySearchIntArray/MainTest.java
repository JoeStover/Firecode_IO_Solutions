package BinarySearchIntArray;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{
	/**
	 * Input: {2}, 2
	 * Output: true
	 */
	@Test
	public void testOne() 
	{
		int[] arr = {2};
		assertTrue(Main.binarySearch(arr, 2));
	}
	
	/**
	 * Input: {2,5,7,9,12}, 2
	 * Output: true
	 */
	@Test
	public void testTwo() 
	{
		int[] arr = {2,5,7,9,12};
		assertTrue(Main.binarySearch(arr, 2));
	}
	
	/**
	 * Input: {2,5,7,8,9,12}, 8
	 * Output: true
	 */
	@Test
	public void testThree() 
	{
		int[] arr = {2,5,7,8,9,12};
		assertTrue(Main.binarySearch(arr, 8));
	}
	
	/**
	 * Input: {2,5,7,9,12}, 8
	 * Output: false
	 */
	@Test
	public void testFour() 
	{
		int[] arr = {2,5,7,9,12};
		assertFalse(Main.binarySearch(arr, 8));
	}
	
	/**
	 * Input: {}, 4
	 * Output: false
	 */
	@Test
	public void testFive() 
	{
		int[] arr = {};
		assertFalse(Main.binarySearch(arr, 4));
	}
	
	/**
	 * Input: {2,5,7,9,12}, 12
	 * Output: true
	 */
	@Test
	public void testSix() 
	{
		int[] arr = {2,5,7,9,12};
		assertTrue(Main.binarySearch(arr, 12));
	}
	
	/**
	 * Input: {2}, 4
	 * Output: false
	 */
	@Test
	public void testSeven() 
	{
		int[] arr = {2};
		assertFalse(Main.binarySearch(arr, 4));
	}

}
