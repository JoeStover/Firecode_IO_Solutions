package ReplaceAllSpaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest 
{

	@Test
	public void testOne() 
	{
		assertEquals(Main.replace("This", "ABC"), "This");
	}
	@Test
	public void testTwo() 
	{
		assertEquals(Main.replace("This is a test", "ABC"), "ThisABCisABCaABCtest");
	}
	@Test
	public void testThree() 
	{
		assertEquals(Main.replace("Replace all spaces", "ABC"), "ReplaceABCallABCspaces");
		
	}
	@Test
	public void testFour() 
	{
		assertEquals(Main.replace("", "ABC"), "");
		
	}
}
