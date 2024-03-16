package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testGetStudent(){
        //Given
        int maxNoStudents = 10;
        Student[] students = new Student[]{new Student("Amelia", "mathew",new Double[]{12.0})};
        Classroom classroom = new Classroom(maxNoStudents,students);
        //When
        Student[] expected = students;
        Student[] actual = classroom.getStudents();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetAverageExamScore(){
        //Given
        int maxNoStudents = 10;
        Student[] students = new Student[]{new Student("Amelia", "mathew",new Double[]{100.0,200.0,300.0})};
        Classroom classroom = new Classroom(maxNoStudents,students);
        //When
        double expected= (100.0 + 200.0 + 300.0)/3;
        double actual = classroom.getAverageExamScore();
        //Then
        Assert.assertEquals(expected,actual,2);
    }
}
