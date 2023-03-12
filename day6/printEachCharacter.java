package assignment.day6;

public class printEachCharacter {

	public static void main(String[] args) {
		//Declare the string name
        String text ="friends";
        //[f,r,i,e,n,d,s]
      //Convert String into character 
		char[] jee= text.toCharArray();
		//store the for loop
		for(int i=0;i<jee.length;i++){
			System.out.println(jee[i]);
			
		}

	}

}
