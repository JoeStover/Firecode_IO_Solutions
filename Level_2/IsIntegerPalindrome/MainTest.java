package IsIntegerPalindrome;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{

	@Test
	public void testOne() 
	{
		assertFalse(Main.isIntPalindrome(-1));
	}

	@Test
	public void testTwo() 
	{
		assertTrue(Main.isIntPalindrome(0));
	}
	
	@Test
	public void testThree() 
	{
		assertTrue(Main.isIntPalindrome(1221));
	}
	
	@Test
	public void testFour() 
	{
		assertTrue(Main.isIntPalindrome(12321));
	}
	
	@Test
	public void testFive() 
	{
		assertFalse(Main.isIntPalindrome(123));
	}
}
