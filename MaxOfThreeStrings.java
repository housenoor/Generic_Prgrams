package com.bl.GenericPrograms;

public class MaxOfThreeStrings {
	// used Integer object and compareTo To test Maximum String
	public static String campareStringMaximum(String firstWord, String secWord, String thirdWord) {
		String maximumString = firstWord;
		if (secWord.compareTo(maximumString) > 0)
			maximumString = secWord;
		if (thirdWord.compareTo(maximumString) > 0)
			maximumString = thirdWord;
		return maximumString;
	}

	// declaring the main method to call another class

	public static void main(String[] args) {
		System.out.printf("Welcome to Generics Method Programming ..");
		System.out.printf("\n the Maximum value of three Integers : "
				+ campareStringMaximum("Srikanth", "Housenoor", "graduation"));
	}
}
