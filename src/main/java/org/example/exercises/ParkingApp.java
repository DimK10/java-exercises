package org.example.exercises;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ParkingApp {

	private static Option option = Option.EXIT;
	private static float hours = 0.0f;
	private static float totalAmountEarned = 0.0f;
	private static int sumOfCars = 0;
	private static Map<String, Float> customerCharges = new HashMap<>();
	private static InputStream inputStream = System.in;

	private static Option optionChecker(Integer input) {
		// todo



		// ask user for option

		// get option from user

		// check validity of option - if not valid loop

		// return valid option via enum value

		switch (input) {
			case 1:
				return Option.CHARGE;
			case 2:
				return Option.SUM;
			case 3:
				return Option.EXIT;
		}

		return Option.EXIT;
	}

	private static <T extends Number> void checkValidInput(Class<T> type,
			InputStream inputStream, String printString) {

		boolean isValid = false;

		Scanner keyboard = new Scanner(inputStream);
		int intInput = 0;



		while (!isValid) {
			System.out.print(printString);

			try {
				if (type.getTypeName().equals(Integer.class.getTypeName())) {
					intInput = keyboard.nextInt();

					if (intInput > 0 && intInput <= 3) {
						isValid = true;
						option = optionChecker(intInput);
					} else {
						System.out.println("The input you gave is not correct. Please give a number from one to three");
					}
				}

				if (type.getTypeName().equals(Float.class.getTypeName())) {
					hours = keyboard.nextFloat();
					isValid = true;
				}

			} catch (InputMismatchException ex) {
				System.out.println("The input you gave is not correct. Please give a number from one to three");
			}
		}

		keyboard.close();
	}

	private static void addCharge(InputStream inputStream) {

		// ask for hours

		// check for valid input - if not valid loop

		checkValidInput(Float.TYPE, inputStream,
				"Please give the hours the car stayed in the parking lot\n");

		calsulateCharges(hours);

	}

	private static void calsulateCharges(float hours) {
		// calculate charge based on hours given
		float charge = 0.0f;
		if (hours >= 24) {
			charge = 10.00f;
		} else if (hours >= 3){
			charge = 3 * 2 + (hours - 3) * 2.5f;
		} else {
			charge = hours * 2;
		}
		// create customer value in hashmap

		// add charge to sum of charges

		// add +1 in sum of cars
	}

	private static void printCharges() {

		// print sum of cars charged
		// print hashmap of customers as a table
		// print sum of charges	as total
	}

	public static void main(String[] args) {

		System.out.println("Welcome to parking app! Please give one of the following options:");

		checkValidInput(Integer.TYPE, inputStream, "1. Charge\n2. Sum\n3. Exit\n");

		switch (option) {
			case CHARGE:
				addCharge(inputStream);
				break;
			case SUM:
				printCharges();
				break;
			default:
				return;
		}
	}
}
