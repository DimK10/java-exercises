package org.example.exercises;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program gets as input two integer numbers, as month and year, and outputs to the console, how many days that
 * month hasm and if given year is leap year.
 */
public class LeapYear {

    //main
    public static void main(String[] args) throws Exception {

        int monthDays = 0;
        boolean leapYear = false;

        leapYear = isYearGivenALeapYear(System.in);
        monthDays = calculateMonthDays(System.in, leapYear);


        System.out.println("The month given has " + monthDays);

        if (leapYear)
            System.out.println("The year given is a leap year");
        else
            System.out.println("The year given is not a leap year");
    }//main

    /**
     * This method gets as inputStream the user input of months and calculated how many days that month has
     * @param inputStream input given by user
     * @param leapYear Boolean that determines if the year given is a leap year or not
     * @return month days
     */
    public static int calculateMonthDays(InputStream inputStream, boolean leapYear) throws Exception {

        int month = 0;
        Scanner input = new Scanner(inputStream);
        System.out.print("Please give a valid month: ");

        try {
            month = input.nextInt();

            input.close();

            // check for positive number up to 12
            if (month < 0 || month > 12) {
                throw new Exception("The input given is not a valid month");
            }

            if (month == 2)
                return leapYear ? 29 : 28;


            if (month % 2 == 1)
                return 31;
            else
                return 30;


        } catch (InputMismatchException e) {
            throw new Exception("The input given is not a valid number", e);
        }
    }

    /**
     * This method gets as inputStream the user input of years and calculates if it is a leap year
     * @param inputStream input given by user
     * @return month days
     */
    public static boolean isYearGivenALeapYear(InputStream inputStream) throws Exception {
        int year = 0;
        Scanner input = new Scanner(inputStream);
        System.out.print("Please give a valid year: ");

        try {
            year = input.nextInt();

            input.close();

            if (year < 0) {
                throw new Exception("The input given is not a valid year");
            }

            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    return true;
                }
            }

            if (year % 400 == 0) {
                return true;
            }

            return false;

        } catch (InputMismatchException e) {
            throw new Exception("The input given is not a valid number", e);
        }
    }

}//class
