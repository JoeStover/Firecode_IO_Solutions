package ReverseAString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{
	Main testObj;
	@Before
	public void setUp() throws Exception 
	{
		testObj = new Main();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/**
	 * Input:  null
	 * Output: null
	 */
	@Test
	public void testOne() 
	{
		assertNull(Main.reverseString(null));
	}

	/**
	 * Input:  "abcd"
	 * Output: "dcba"
	 */
	@Test
	public void testTwo() 
	{
		assertEquals("dcba", Main.reverseString("abcd"));
	}
	
	/**
	 * Input:  "a"
	 * Output: "a"
	 */
	@Test
	public void testThree() 
	{
		assertEquals("a", Main.reverseString("a"));
	}
	
	/**
	 * Input:  ""
	 * Output: ""
	 */
	@Test
	public void testFour() 
	{
		assertEquals("", Main.reverseString(""));
	}
	
	/**
	 * Input:  null
	 * Output: null
	 */
	@Test
	public void testOneRec() 
	{
		assertNull(Main.revStringRecursive(null));
	}

	/**
	 * Input:  "abcd"
	 * Output: "dcba"
	 */
	@Test
	public void testTwoRec() 
	{
		assertEquals("dcba", Main.revStringRecursive("abcd"));
	}
	
	/**
	 * Input:  "a"
	 * Output: "a"
	 */
	@Test
	public void testThreeRec() 
	{
		assertEquals("a", Main.revStringRecursive("a"));
	}
	
	/**
	 * Input:  ""
	 * Output: ""
	 */
	@Test
	public void testFourRec() 
	{
		assertEquals("", Main.revStringRecursive(""));
	}
}
