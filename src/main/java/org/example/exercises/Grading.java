package org.example.exercises;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program calculates the grading of a student based on a scale given by the exercise
 */
public class Grading {
    public static void main(String[] args) throws Exception {

        String grade = "";

        calculateGrade(System.in);
        System.out.println("Your grade is: " + grade);


    }

    /**
     * This method calculates a grade for the user input and returns it.
     * @param inputStream score given by user
     * @return grade
     */
    public static String calculateGrade(InputStream inputStream) throws Exception {

        int score = 0;

        Scanner input = new Scanner(inputStream);

        try {
            score = input.nextInt();

            input.close();

            // check for positive number up to 100
            if (score < 0 || score > 100) {
                throw new Exception("The input given is not a valid score");
            }

            if (score >= 94)
                return "A";
            else if (score >= 90)
                return "A-";

            else if (score >= 86)
                return "B+";
            else if (score >= 81)
                return "B";
            else if (score >= 78)
                return "B-";
            else if (score >= 75)
                return "C+";
            else if (score >= 70)
                return "C";
            else if (score >= 65)
                return "C-";
            else if (score >= 60)
                return "D";
            else
                return "F";


        } catch (InputMismatchException e) {
            throw new Exception("The input given is not a valid number", e);
        }
    }
}
