package assignment.day6;

import java.util.Arrays;

public class Secondlargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the array
		int[] data= {1,5,9,2,6,3,5,4,8,7};
		Arrays.sort(data);
		int size= data.length;
		//store the for loop
		for (int i = 0; i < size; i++) {
			//print the output
			System.out.println(data[i]);
			System.out.println(data[data.length-2]);

	}

}
}