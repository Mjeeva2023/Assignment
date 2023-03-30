package assignment3;

import java.util.Arrays;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String[] company = {"Google","Microsoft","TestLeaf","Maverick"};
		Arrays.sort(company);
		for (int i = 0; i < company.length; i++) {
			System.out.println(company[i] + " ");
			
		}
	}

}
