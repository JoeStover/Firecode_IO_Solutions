package InsertStars;

/**
 * Insert Stars
 * 
 * Given a string, recursively compute a new string where the identical adjacent 
 * characters in the original string are separated by a "*". 
 * 
 * Examples:
 * 
 * insertPairStar("cac") ==> "cac"
 * 
 * insertPairStar("cc") ==> "c*c"
 * 
 * @author Joe
 * @version 09/15/2018
 */
public class Main 
{
	public static String insertPairStar(String s) 
	{
		if(s == null || s.length() < 2)
		{
			return s;
		}		
		if(s.charAt(0) == s.charAt(1))
		{
			return insertPairStar(s.substring(0, 1)) + "*" + insertPairStar(s.substring(1));
		}
		return insertPairStar(s.substring(0, 1)) + insertPairStar(s.substring(1));
	}
}
