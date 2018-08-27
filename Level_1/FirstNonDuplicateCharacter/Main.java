package FirstNonDuplicateCharacter;

import java.util.*;
/**
 * Find the First Non Duplicate Character in a String
 * 
 * Find the first non-duplicate character in a string. 
 * Return null if no unique character is found.
 * 
 * Examples:
 * 
 * firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
 * firstNonRepeatedCharacter( "cbcd" ) --> 'b'
 * firstNonRepeatedCharacter( "cdcd" ) --> null
 *  
 * @author Joe
 * @08/27/2018
 */
public class Main 
{
	public static Character firstNonRepeatedCharacter(String str) 
	{
		Map<Character, Integer> orderedFreqMap = 
				new LinkedHashMap<Character, Integer>();
		for(char c : str.toCharArray())
		{
			if(orderedFreqMap.containsKey(c))
			{
				orderedFreqMap.put(c, orderedFreqMap.get(c) + 1);
			}
			else
			{
				orderedFreqMap.put(c,  1);
			}
		}
		for(Map.Entry<Character, Integer> entry : 
			orderedFreqMap.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		return null;
	}
}
