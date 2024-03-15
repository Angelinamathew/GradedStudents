package io.zipcoder;

import org.junit.Test;

public class StudentTest {
    Student student = new Student();
    @Test
    public void getExamScores() {
        /// : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double[] output = student.getExamScores();

        // Then
        System.out.println(output);


    }
}