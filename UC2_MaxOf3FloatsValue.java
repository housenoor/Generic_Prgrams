package com.bl.GenericPrograms;

public class UC2_MaxOf3FloatsValue {
	public static Integer compareIntegerMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber = firstNumber;
		if (secondNumber.compareTo(maximumNumber) > 0)
			maximumNumber = secondNumber;
		if (thirdNumber.compareTo(maximumNumber) > 0)
			maximumNumber = thirdNumber;
		return maximumNumber;
	}

	public static Float compareFloatMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maximumNumber = firstNumber;
		if (secondNumber.compareTo(maximumNumber) > 0)
			maximumNumber = secondNumber;
		if (thirdNumber.compareTo(maximumNumber) > 0)
			maximumNumber = thirdNumber;
		return maximumNumber;
	}

	// Declared MAin Method
	public static void main(String[] args) {
		System.out.printf("Welcome to Generics Method Programming ..");
		System.out.printf("\n the Maximum value of three Integers : " + compareIntegerMaximum(55, 40, 50));
		System.out.printf("\n the Maximum value of three Floats: " + compareFloatMaximum(22.9f, 3.3f, 33.65746f));

	}
}
