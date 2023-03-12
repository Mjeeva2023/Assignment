package assignment.day6;

//import java.util.Iterator;

public class printduplicuteint {
	public static void main(String[] args) {
		//Declare the  array  value
		int[]array1= {2,1,6,3,4,6,3,6};
		//Declare a variable as count with value 0
		int count = 0;
		//store inner loop, to compare the values
		for (int i = 0; i < array1.length; i++) {
			count = 1;
			for (int j = i+1; j < array1.length; j++) {
				//Compare two values
				if(array1[i]==array1[j]) {
					//Increment the count variable 
					count++;
					//Store a dummy value in a[j]
					array1[j]=50;
					System.out.println(array1[i]);
				}
				
			}
			if(count>1&& array1[i]!=50) {
				System.out.println(array1[i]);
			}
			
		}
	}
}

