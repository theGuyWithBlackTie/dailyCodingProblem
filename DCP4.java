/*
 * Question 4:
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, 
 * find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 * 
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */
package DCP;

public class DCP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[]{6,4,1,3,2};
		int[] secondArray= new int[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]>0 && inputArray[i]<=inputArray.length)
				secondArray[inputArray[i]-1] = Integer.MIN_VALUE;
		}
		
		int answer = Integer.MIN_VALUE;
		for(int i=0;i<secondArray.length;i++)
		{
			if(secondArray[i] != Integer.MIN_VALUE)
			{
				answer = i+1;
				break;
			}
		}
		
		if(answer == Integer.MIN_VALUE)
			answer = secondArray.length+1;
		
		System.out.println(answer);
	}

}
