package PalindromeTester;

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
	 * Input:  "madam"
	 * Output: true
	 */
	@Test
	public void iterTestOne() 
	{
		assertTrue(Main.isStringPalindrome("madam"));
	}
	
	/**
	 * Input:  "a"
	 * Output: true
	 */
	@Test
	public void iterTestTwo() 
	{
		assertTrue(Main.isStringPalindrome("a"));
	}

	/**
	 * Input:  ""
	 * Output: true
	 */
	@Test
	public void iterTestThree() 
	{
		assertTrue(Main.isStringPalindrome(""));
	}

	/**
	 * Input:  null
	 * Output: true
	 */
	@Test
	public void iterTestFour() 
	{
		assertTrue(Main.isStringPalindrome(null));
	}

	/**
	 * Input:  "not a palindrome"
	 * Output: false
	 */
	@Test
	public void iterTestFive() 
	{
		assertFalse(Main.isStringPalindrome("not a palindrome"));
	}
	
	/**
	 * Input:  "madam"
	 * Output: true
	 */
	@Test
	public void recTestOne() 
	{
		assertTrue(Main.isPaliRecursive("madam"));
	}
	
	/**
	 * Input:  "a"
	 * Output: true
	 */
	@Test
	public void recTestTwo() 
	{
		assertTrue(Main.isPaliRecursive("a"));
	}

	/**
	 * Input:  ""
	 * Output: true
	 */
	@Test
	public void recTestThree() 
	{
		assertTrue(Main.isPaliRecursive(""));
	}

	/**
	 * Input:  null
	 * Output: true
	 */
	@Test
	public void recTestFour() 
	{
		assertTrue(Main.isPaliRecursive(null));
	}

	/**
	 * Input:  "not a palindrome"
	 * Output: false
	 */
	@Test
	public void recTestFive() 
	{
		assertFalse(Main.isPaliRecursive("not a palindrome"));
	}
}
