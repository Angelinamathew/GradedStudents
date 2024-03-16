package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testStudentConstructor() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        //When
        Student student = new Student(firstName, lastName, testScore);
        //Then
        Assert.assertNotNull(student);

    }
    @Test
    public void testSetFirstName() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        String expected ="Amelia";
        student.setFirstName(expected);
        String actual = student.getFirstName();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetLastName() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        String expected ="Mathew";
        student.setLastName(expected);
        String actual = student.getLastName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamScores() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        String expected ="Exam 1 -> 50\n Exam 2 -> 60\n Exam 3 -> 70";
        String actual = student.getExamScores();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAddExamScore() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        student.addExamScore(80.0);
        String expected ="Exam 1 -> 50\n Exam 2 -> 60\n Exam 3 -> 70\n Exam 4 -> 80\n";
        String actual = student.getExamScores();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetExamScore() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        student.setExamScores(1, 150.0);
        String expected ="Exam 1 -> 150\n Exam 2 -> 60\n Exam 3 -> 70\n Exam 4 -> 80\n";
        String actual = student.getExamScores();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetAverageExamScore() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        Double expected = (50.0 + 60.0 + 70.0)/3;
        String actual = student.getAverageExamScore();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testToString() {
        //Given
        String firstName = "Amelia";
        String lastName = "Mathew";
        Double[] testScore = new Double[]{50.0, 60.0, 70.0};
        Student student = new Student(firstName, lastName, testScore);
        //When
        String expected = "Student name "+ firstName+ " "+lastName+"\n"+
                "> Average Score: "+ student.getAverageExamScore() + "\n"+
                "> Exam Scores:\n "+ "Exam 1 -> 150\n Exam 2 -> 60\n Exam 3 -> 70\n Exam 4 -> 80";
        String actual = student.toString();
        //Then
        Assert.assertEquals(expected, actual);
    }

}