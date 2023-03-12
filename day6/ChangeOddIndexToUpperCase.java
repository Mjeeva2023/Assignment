package assignment.day6;
public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//Declare the string
		String name = "Muniyandi";
		//output MUnIyAnDi
		//convert strings to char array
		char[] jee= name.toCharArray();
		 //Method to convert characters
		for (int i = 0; i<name.length();i++) 
		{
			////Initialize if condition
			if(i%2!=0)
			{
				//character to change the Uppercase
			jee[i]=Character.toUpperCase(jee[i]);
			}
			}
		//print the output
		System.out.println(jee);
}
}