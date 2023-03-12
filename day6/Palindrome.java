package assignment.day6;

//import java.util.Scanner;

public class Palindrome {

   public static void main(String[] args) {
		//Declare the string name
		String name="madam";
		//Declare empty string as rev
		String jee="";
		//initialize string to upper case
		String upperCase = name.toUpperCase();
		//split each characters from string using toCharArray
		char[] charArray = upperCase.toCharArray();
		//store for loop
		for (int i = charArray.length-1; i >=0 ; i--) {
			//store the iteration in rev
			jee=jee+charArray[i];
			
		}
		//print the values rev
		System.out.println(jee);
		//Initialize if condition 
		if (name.equalsIgnoreCase(jee)) {
			
			System.out.println("It is a Plaindrome");
			
		} else {
			
			System.out.println("It is not a Palindrome");

		}
	
	}

}
   


	


