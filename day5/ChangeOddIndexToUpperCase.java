package assignments.day5;
public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String name = "jeeva";
		char[] jee= name.toCharArray();
		for (int i = 0; i<name.length();i++) 
		{
			if(i%2!=0)
			{
			jee[i]=Character.toUpperCase(jee[i]);
			}
			}
		System.out.println(jee);
}
}