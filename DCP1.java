/*
 * Question 1:
 * Given a list of numbers and a number 'k', return whether any two numbers from the list add up to 'k'.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
 * 
 * Answer:
 * The question can be solved in two ways. First is obviously by 'Two-Passes' and this would fail when array is huge.
 * Second solution is doing it in "One-Pass" which is the expected solution :). 
 */

package DCP;

import java.util.HashMap;

public class DCP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[] {10,15,3,7};
		int k = 22;
		
		//Two pass solution
		int a=0,b=0;
		int flag = 0;
		for(int i=0; i<inputArray.length-1; i++)
		{
			a = inputArray[i];
			
			for(int j=i+1; j<inputArray.length; j++)
			{
				b = inputArray[j];
				if(a+b == k) {
					flag = 1; 
					break;
				}
			}
			
			if(flag == 1)
				break;
		}
		if(flag == 1)
		{
			System.out.println("FIRST TRUE. Numbers are:-"+a+", "+b);
		}
		else
		{
			System.out.println("FIRST FALSE");
		}
		
		//One Pass solution
		int temp,diff;
		HashMap<Integer, Integer> secondArray = new HashMap<Integer, Integer>();
		for(int i=0; i<inputArray.length; i++)
		{
			temp = inputArray[i];
			diff = k - temp;
			if(secondArray.containsKey(diff))
			{
				System.out.println("SECOND TRUE. Numbers are:- "+a+", "+b);
				break;
			}
			else
			{
				secondArray.put(temp, temp);
			}
		}
	}

}
