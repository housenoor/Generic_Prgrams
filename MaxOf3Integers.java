package com.bl.GenericPrograms;

public class MaxOf3Integers {
	public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber = firstNumber;
		if (secondNumber.compareTo(maximumNumber) > 0)
			maximumNumber = secondNumber;
		if (thirdNumber.compareTo(maximumNumber) > 0)
			maximumNumber = thirdNumber;
		return maximumNumber;
	}

	// Declared MAin Method
	public static void main(String[] args) {
		System.out.printf("Welcome to Generics Method Programming ..");
		System.out.printf("the Maximum value of three Integers :\n " + compareIntegerMaximum(55, 40, 50));
	}
}
