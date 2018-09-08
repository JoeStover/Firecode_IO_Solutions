package BubbleSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOne() 
	{
		int[] arr = {4};
		Main.bubbleSortArray(arr);
		assertEquals("[4]", Arrays.toString(arr));
	}
	
	@Test
	public void testTwo() 
	{
		int[] arr = {52,3,2};
		Main.bubbleSortArray(arr);
		assertEquals("[2, 3, 52]", Arrays.toString(arr));
	}
	
	@Test
	public void testThree() 
	{
		int[] arr = {4,12,4,78,7,-1};
		Main.bubbleSortArray(arr);
		assertEquals("[-1, 4, 4, 7, 12, 78]", Arrays.toString(arr));
	}
	
	@Test
	public void testFour() 
	{
		int[] arr = {};
		Main.bubbleSortArray(arr);
		assertEquals("[]", Arrays.toString(arr));
	}

}
