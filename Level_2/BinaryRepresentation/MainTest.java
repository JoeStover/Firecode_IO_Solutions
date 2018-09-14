package BinaryRepresentation;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		assertEquals("0", Main.computeBinary(0));
	}
	
	@Test
	public void testTwo() 
	{
		assertEquals("110100", Main.computeBinary(52));
	}

	@Test
	public void testThree() 
	{
		assertEquals("1111", Main.computeBinary(15));
	}
	
	@Test
	public void testFour() 
	{
		assertEquals("1010", Main.computeBinary(10));
	}
	
	@Test
	public void testFive() 
	{
		assertEquals("1", Main.computeBinary(1));
	}
}
