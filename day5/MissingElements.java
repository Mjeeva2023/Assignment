package assignments.day5;

import java.util.Arrays;

public class MissingElements {

	
		
			public static void main(String[] args) {
				
				int []num= {4,5,7,8,9,1,2,3};
				Arrays.sort(num);
				int a=0;
				for (int i = 1; i <=9; i++) {
				 a=a+i;
					
				}
				int b=0;
				for (int i = 0; i < num.length; i++) {
				 b=b+num[i];
					
				}
				int sum=a-b;
				System.out.println("Missing Element is "+sum);
			}

		

	}


