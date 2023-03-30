package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set <Integer> List1 = new TreeSet <Integer> ();
		 
		for (int i = 0; i < data.length; i++) {
			List1.add(data[1]);
			
		}
		List <Integer> Set = new ArrayList <Integer>(List1);
		System.out.println(data[data.length-1]);
		

}
	
}