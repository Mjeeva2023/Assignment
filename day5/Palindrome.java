package assignments.day5;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        //Initialization of empty string to store reversed characters
        String mj = "";
        for (int i = str.length() - 1; i >=0; i--) {
            
            mj = mj + str.charAt(i);
        }
        //comparing strings
        if (str.equals(mj))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}



	


