package io.zipcoder;

public class Classroom {
    Student[] student;
    int maxNumberOfStudents;
    public Classroom() {
        student = new Student[30];
    }

    public Classroom(int maxNumberOfStudents ){
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.student = new Student[maxNumberOfStudents];
    }
    public Classroom(int maxNumberOfStudents, Student[] students){
        this.maxNumberOfStudents =maxNumberOfStudents;
        this.student = students;
    }


    public Student[] getStudents() {
        return student;
    }
}
