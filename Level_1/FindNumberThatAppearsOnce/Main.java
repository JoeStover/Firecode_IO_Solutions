package FindNumberThatAppearsOnce;

import java.util.*;

/**
 * Find the Number that Appears Once
 * 
 * Write a method that returns a number that appears only once in an array.
 * Assume the array will surely have a unique value. The array will never be empty.
 * 
 * Examples:
 * 
 * {1,2,3,4,1,2,4,3,5} ==> 5
 * 
 * @author Joe
 * @version 08/26/2018
 */
public class Main 
{
	/**
	 * Naive hash version. Considered XOR, but that won't work for cases where duplication
	 * is an odd count... Could also do a sort and iterate for O(n log n).
	 */
	public static int singleNumber(int[] A) 
	{
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for(int num : A)
		{
			if(freqMap.containsKey(num))
			{
				freqMap.put(num, freqMap.get(num) + 1);
			}
			else
			{
				freqMap.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) 
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		return -1;
	}
}
