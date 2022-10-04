package org.example.exercises;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testWrongMonthInput() {
        //given
        String wrongInput = "a";
        String actualMessage;
        String expectedMessage = "The input given is not a valid number";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
        actualMessage = assertThrows(Exception.class, () -> {
            LeapYear.calculateMonthDays(in, false);
        }).getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testMonthInputOutOfRange() {
        //given
        String wrongInput = "-1";
        String expectedMessage = "The input given is not a valid month";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
       String actualMessage =
               assertThrows(Exception.class, () -> LeapYear.calculateMonthDays(in, false))
                       .getMessage();


       assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testWrongYearInput() {
        //given
        String wrongInput = "a";
        String expectedMessage = "The input given is not a valid number";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
        String actualMessage = assertThrows(Exception.class, () ->
            LeapYear.isYearGivenALeapYear(in))
                .getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testYearInputOutOfRange() {
        //given
        String wrongInput = "-1";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
        assertThrows(Exception.class, () -> LeapYear.calculateMonthDays(in, false));
    }

    @Test
    void calculateMonthDaysNotLeapYear() throws Exception {
        //given
        int month = 2;
        int actualMonthDays;
        int expectedMonthDays = 28;

        //when
        actualMonthDays =
                LeapYear.calculateMonthDays(new ByteArrayInputStream(String.valueOf(month).getBytes()), false);

        //then
        assertEquals(actualMonthDays, expectedMonthDays);
    }

    @Test
    void calculateMonthDaysIsLeapYear() throws Exception {
        //given
        int month = 2;
        int actualMonthDays;
        int expectedMonthDays = 29;

        //when
        actualMonthDays =
                LeapYear.calculateMonthDays(new ByteArrayInputStream(String.valueOf(month).getBytes()), true);

        //then
        assertEquals(expectedMonthDays, actualMonthDays);
    }

    @Test
    void calculateMonthDaysNotLeapYearNotFebruary() throws Exception {
        //given
        int month = 7;
        int actualMonthDays;
        int expectedMonthDays = 31;

        //when
        actualMonthDays =
                LeapYear.calculateMonthDays(new ByteArrayInputStream(String.valueOf(month).getBytes()), false);

        //then
        assertEquals(expectedMonthDays, actualMonthDays);
    }


        @Test
    void isYearGivenALeapYearOnLeapYear() throws Exception {

        //given
        int year = 2000;
        boolean actualResult;
        boolean expectedResult = true;

        //when
        actualResult = LeapYear.isYearGivenALeapYear(new ByteArrayInputStream(String.valueOf(year).getBytes()));

        //then
        assertEquals(expectedResult, actualResult);

    }
}