package FindNumberThatAppearsOnce;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testOne() 
	{
		int[] array = {1, -1, 1};
		assertEquals(-1, Main.singleNumber(array));
	}
	
	@Test
	public void testTwo() 
	{
		int[] array = {1, 2, 3, 4, 1, 2, 4, 3, 5};
		assertEquals(5, Main.singleNumber(array));
	}
	
	@Test
	public void testThree() 
	{
		int[] array = {1, 1, 1, 4, 5, 6, 7, 7, 6, 4};
		assertEquals(5, Main.singleNumber(array));
	}
	
	@Test
	public void testFour() 
	{
		int[] array = {1};
		assertEquals(1, Main.singleNumber(array));
	}
	
	@Test
	public void testFive() 
	{
		int[] array = {1, 2, 3, 3, 2, 1, 7, 8, 8};
		assertEquals(7, Main.singleNumber(array));
	}

}
