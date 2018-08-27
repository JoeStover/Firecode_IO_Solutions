package FirstNonDuplicateCharacter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	/**
	 * Input: "aabcdc"
	 * Output: 'b'
	 */
	@Test
	public void testOne() 
	{
		assertTrue('b' == Main.firstNonRepeatedCharacter("aabcdc"));
	}
	
	/**
	 * Input: "aaaa"
	 * Output: null
	 */
	@Test
	public void testTwo() 
	{
		assertNull(Main.firstNonRepeatedCharacter("aaaa"));
	}
	
	/**
	 * Input: "b"
	 * Output: 'b'
	 */
	@Test
	public void testThree() 
	{
		assertTrue('b' == Main.firstNonRepeatedCharacter("b"));
	}
	
	/**
	 * Input: "abcdcd"
	 * Output: 'a'
	 */
	@Test
	public void testFour() 
	{
		assertTrue('a' == Main.firstNonRepeatedCharacter("abcdcd"));
	}

}
