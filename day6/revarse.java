package assignment.day6;

public class revarse {

	public class ReverseString {
		public void main(String[] args) {
			//Declare String name
			String name="jeeva software";
			//Initialize string to upper case
			String upperCase = name.toUpperCase();
			//split each characters from string using toCharArray
			char [] charArray=upperCase.toCharArray();
			//store For loop as Decrement
			for (int i = charArray.length-1; i >=0 ; i--) {
				//Print the output
				System.out.println(charArray[i]);
			}
			
		}

	}}

	


