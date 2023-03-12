package assignment.day6;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	//Declare the two string
	String str1 = "race";
	String str2= "care";
	
	int length1 = str1.length();
	int length2 = str2.length();
	//if length is same
	if(length1==length2) {
		System.out.println("length are equal");
	}else {
		System.out.println("not equal");
	}
	//convert strings to char array
	char[] charArray = str1.toCharArray();
	char[] charArray1 = str2.toCharArray();
	//sort the char array
	Arrays.sort(charArray);
	Arrays.sort(charArray);
	//if sorted char arrays are same
    // then the string is anagram
	
	boolean result = Arrays.equals(charArray, charArray1);
	if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
}
