package FindMissingNumberInRange;

/**
 * Find the Missing Number in a Set of Numbers from 1 to 10
 * 
 * Given an Array containing 9 numbers ranging from 1 to 10, 
 * write a method to find the missing number. Assume you have 
 * 9 numbers between 1 to 10 and only one number is missing.
 * 
 * Example:  findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
 * 
 * @author Joe
 * @version 09/04/2018
 */
public class Main 
{
	// SUM = n(n = 1) / 2 ... where n = the last digit of the sequence,
	//                        in this case, array length = 1 since missing a number
	public static int findMissingNumber(int[] arr)
	{
		int arrSum = 0;
		for(int num : arr)
		{
			arrSum += num;
		}
		int sumN = ((arr.length + 1) * (arr.length + 2)) / 2;
		return sumN - arrSum;
	}
}
