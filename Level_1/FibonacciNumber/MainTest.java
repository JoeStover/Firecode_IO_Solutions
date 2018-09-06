package FibonacciNumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		assertEquals(1, Main.fib(1));
	}
	@Test
	public void testTwo() 
	{
		assertEquals(55, Main.fib(10));
	}
	@Test
	public void testThree() 
	{
		assertEquals(0, Main.fib(0));
	}
}
