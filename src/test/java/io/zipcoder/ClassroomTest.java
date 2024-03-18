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
        int maxNumberOfStudents = 10;
        Double[] examScores = {100.0,150.0,130.0};
        Student students = new Student("Amelia", "mathew",examScores);
        Classroom classroom = new Classroom(maxNumberOfStudents);
        //When
        double expected= (100.0 + 200.0 + 300.0)/3;
        double actual = classroom.getAverageExamScore();
        //Then
        Assert.assertEquals(expected,actual,2);
    }
    @Test
    public void testAddStudent(){
        //Given
        int maxNumberOfStudents = 20;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0,150.0,130.0};
        Student students = new Student("Amelia", "Mathew", examScores);
        //When
        Student student = new Student("Ann", "Mathews", new Double[] {120.0,170.0,150.0});
        classroom.addStudents(student);
        double expected = 2;
        double actual = classroom.getStudents().length;

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveStudent() {
        //Given
        int maxNumberOfStudents = 20;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 130.0};
        Student students = new Student("Amelia", "Mathew", examScores);
        //When
        Student student = new Student("Ann", "Mat", new Double[]{120.0, 170.0, 150.0});
        Student student1 = new Student("Amm", "Mat", new Double[]{120.0, 170.0, 150.0});
        Student student2 = new Student("All", "Mat", new Double[]{120.0, 170.0, 150.0});
        Student student3 = new Student("Aww", "Mat", new Double[]{120.0, 170.0, 150.0});
        classroom.addStudents(student);
        classroom.addStudents(student1);
        classroom.addStudents(student2);
        classroom.addStudents(student3);

        classroom.removeStudents("Amelia", "Mathew");

        Assert.assertNotNull(classroom.getStudents()[0]);
        Assert.assertNull(classroom.getStudents()[4]);
    }
    @Test
    public void testGetStudentByScore() {
        //Given
        int maxNumberOfStudents = 20;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {150.0, 150.0, 140.0};
        Student students = new Student("Amelia", "Mathew", examScores);
        //When
        Student student = new Student("Ann", "Mat", new Double[]{120.0, 170.0, 150.0});
        Student student1 = new Student("Amm", "Mat", new Double[]{115.0, 165.0, 155.0});
        Student student2 = new Student("All", "Mat", new Double[]{110.0, 160.0, 140.0});
        Student student3 = new Student("Aww", "Mat", new Double[]{100.0, 140.0, 90.0});
        classroom.addStudents(student);
        classroom.addStudents(student1);
        classroom.addStudents(student2);
        classroom.addStudents(student3);

    }

}
