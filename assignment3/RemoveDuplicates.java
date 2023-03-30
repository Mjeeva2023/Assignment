package assignment3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String copy = "Tamil Nadu";
		char copyArr[] = copy.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();
		for (int i = 0; i < copyArr.length; i++) {
			boolean bad = charSet.add(copyArr[i]);
			if (!bad) {
				charSet.remove(copyArr[i]);
				dupCharSet.add(copyArr[i]);
			}
			
		}
		for (char c : charSet) {
			for (char d : dupCharSet) {
				if (charSet.equals(dupCharSet)) {
					
				}
			}
			
		}
		System.out.println(dupCharSet);
		System.out.println(charSet);
	}

}
