package RepeatedArrayElements;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		int[] nums = {1,3,3,4};
		assertEquals("[3]", Main.duplicate(nums));
	}
	
	@Test
	public void testTwo() 
	{
		int[] nums = {4};
		assertEquals("", Main.duplicate(nums));
	}
	
	@Test
	public void testThree() 
	{
		int[] nums = {1,5,23,2,6,3,1,8,12,3};
		assertEquals("[1, 3]", Main.duplicate(nums));
	}
	
	@Test
	public void test() 
	{
		int[] nums = {4,3,1};
		assertEquals("", Main.duplicate(nums));
	}
}
