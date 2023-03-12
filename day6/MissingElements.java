package assignment.day6;

import java.util.Arrays;


public class MissingElements {
	public static void main(String[] args) {
		//Declare the  array  value
		int num[]=  {5,1,4,2,6,3,7,8};		
		//sort the array
		Arrays.sort(num);
		//store the loop
	for (int i = 0; i < num.length; i++) {
		//if condition to find the Missing element
			 if (num[i]!=i+1) {
				// print the result
				 System.out.println(i+1);
				 break;
			 }	
			}
		
		
	}

}


