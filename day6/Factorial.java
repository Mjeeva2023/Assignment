package assignment.day6;

public class Factorial {

	public static void main(String[] args) {
		//Declare the integer value
		int a=5;
		int fact=1;
		//store the for loop
		for (int i = a; i >=1;i--) {
		//It is the number to  Factorial
			fact=fact*i;			
		}
		//output 120
		System.out.println(fact);
		

	}

}

