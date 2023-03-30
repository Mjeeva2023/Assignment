
package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
	 String text = "We learn java basics as part of java sessions in java week1";
	 String[] textArray = text.split("");
	 Set<String> textSet = new LinkedHashSet<>();
	 for (int i = 0; i < textArray.length; i++) {
		 textSet.add(textArray[i]);
		
	}
	 System.out.println(textSet);
		
	}

}
