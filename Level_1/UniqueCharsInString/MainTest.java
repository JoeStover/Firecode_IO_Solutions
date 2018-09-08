package UniqueCharsInString;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		assertTrue(Main.areAllCharactersUnique("A"));
	}
	@Test
	public void testTwo() 
	{
		assertTrue(Main.areAllCharactersUnique(""));
	}
	@Test
	public void testThree() 
	{
		assertTrue(Main.areAllCharactersUnique(null));
	}
	@Test
	public void testFour() 
	{
		assertTrue(Main.areAllCharactersUnique("123!@"));
	}
	@Test
	public void testFive() 
	{
		assertFalse(Main.areAllCharactersUnique("Not unique"));
	}

}
