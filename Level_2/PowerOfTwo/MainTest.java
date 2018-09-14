package PowerOfTwo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		assertTrue(Main.isPowOfTwo(1));
	}
	
	@Test
	public void testTwo() 
	{
		assertFalse(Main.isPowOfTwo(9));
	}
	
	@Test
	public void testThree() 
	{
		assertTrue(Main.isPowOfTwo(256));
	}
	
	@Test
	public void testFour() 
	{
		assertTrue(Main.isPowOfTwo(8));
	}
	
	@Test
	public void testFive() 
	{
		assertFalse(Main.isPowOfTwo(5));
	}

}
