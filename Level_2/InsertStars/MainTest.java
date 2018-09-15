package InsertStars;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest 
{
	@Test
	public void testOne() 
	{
		assertEquals("ab*ba", Main.insertPairStar("abba"));
	}

	@Test
	public void testTwo() 
	{
		assertEquals("b*b*b", Main.insertPairStar("bbb"));
	}
	@Test
	public void testThree() 
	{
		assertEquals("ab*b*ba", Main.insertPairStar("abbba"));
	}
	@Test
	public void testFour() 
	{
		assertEquals("b", Main.insertPairStar("b"));
	}
	@Test
	public void testFive() 
	{
		assertNull(Main.insertPairStar(null));
	}
}
