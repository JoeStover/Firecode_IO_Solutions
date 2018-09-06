package FindMissingNumberInRange;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{

	@Test
	public void testOne() 
	{
		int[] arr = {4,5,6,7,8,10,1,2,3};
		assertEquals(9, Main.findMissingNumber(arr));
	}

	@Test
	public void testTwo() 
	{
		int[] arr = {1,2,3,4,5,6,7,8,10};
		assertEquals(9, Main.findMissingNumber(arr));
	}
	
	@Test
	public void testThree() 
	{
		int[] arr = {6,7,8,9,10,1,2,4,5};
		assertEquals(3, Main.findMissingNumber(arr));
	}
	
	@Test
	public void testFour() 
	{
		int[] arr = {1,2,4,5,6,7,8,9,10};
		assertEquals(3, Main.findMissingNumber(arr));
	}
}
