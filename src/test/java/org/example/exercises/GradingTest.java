package org.example.exercises;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {

    @Test
    void testWrongGradeInput() {
        //given
        String wrongInput = "a";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
        Exception exception = assertThrows(Exception.class, () -> {
            Grading.calculateGrade(in);
        });
    }

    @Test
    void testGradeInputOutOfRange() {
        //given
        String wrongInput = "-1";
        String expectedMessage = "The input given is not a valid score";
        InputStream in = new ByteArrayInputStream(wrongInput.getBytes());

        //when


        //Then
        String actualMessage =
                assertThrows(Exception.class, () -> Grading.calculateGrade(in))
                        .getMessage();


        assertEquals(expectedMessage, actualMessage);
    }


    @Test
    void calculateGradeBelow60() throws Exception {
        //given
        int score = 59;
        String actualGrade;
        String expectedGrade = "F";

        //when
        actualGrade =
                Grading.calculateGrade(new ByteArrayInputStream(String.valueOf(score).getBytes()));

        //then
        assertEquals(actualGrade, expectedGrade);
    }

    @Test
    void calculateGradeAt79() throws Exception {
        //given
        int score = 79;
        String actualGrade;
        String expectedGrade = "B-";

        //when
        actualGrade =
                Grading.calculateGrade(new ByteArrayInputStream(String.valueOf(score).getBytes()));

        //then
        assertEquals(actualGrade, expectedGrade);
    }

    @Test
    void calculateGradeAt94() throws Exception {
        //given
        int score = 94;
        String actualGrade;
        String expectedGrade = "A";

        //when
        actualGrade =
                Grading.calculateGrade(new ByteArrayInputStream(String.valueOf(score).getBytes()));

        //then
        assertEquals(actualGrade, expectedGrade);
    }
}