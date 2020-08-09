/*
 * Question 2:
 * Given an array of integers, return a new array such that each element at index 'i' of the new array
 * is the product of all the numbers in the original array except the one at 'i'.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
package DCP;

import java.util.Arrays;

public class DCP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[]{1, 2, 3, 4, 5};
		
		//Division Solution
		int multiplicationResult = 1;
		for(int i=0; i<inputArray.length; i++)
		{
			multiplicationResult = multiplicationResult*inputArray[i];
		}
		int[] resultantArray = new int[inputArray.length];
		for(int i=0; i<inputArray.length; i++)
		{
			resultantArray[i] = multiplicationResult/inputArray[i];
		}
		System.out.println("Result is:\n"+Arrays.toString(resultantArray));
		
		
		
		//Without Division Solution
		int[] firstArray = new int[inputArray.length];
		int[] secondArray= new int[inputArray.length];
		firstArray[0] = 1;
		secondArray[inputArray.length-1] = 1;
		for(int i=1; i<inputArray.length;i++)
		{
			firstArray[i] = firstArray[i-1]*inputArray[i-1];
		}
		
		for(int i=inputArray.length-2;i>=0;i--)
		{
			secondArray[i] = secondArray[i+1]*inputArray[i+1];
		}
		
		int[] resultArray = new int[inputArray.length];
		for(int i=0; i<inputArray.length;i++)
			resultArray[i] = firstArray[i]*secondArray[i];
		System.out.println("Result is:\n"+Arrays.toString(resultArray));

	}

}
