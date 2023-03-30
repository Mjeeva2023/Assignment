package assignment3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name = "Muniyandi";
		char[] nameArray = name.toCharArray();
		Set<Character> nameSet = new HashSet<>();
		for (int i = 0; i < nameArray.length; i++) {
			boolean good = nameSet.add(nameArray[i]);
			if(!good) {
				nameSet.remove(nameArray[i]);
			}
			
		}
		System.out.println(nameSet);
	}

}
