package io.zipcoder;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

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

    public double getAverageExamScore() {
        double total= 0;
        for (Student stu: student){
            total += stu.getAverageExamScore();
        }
        return total/student.length;
    }

    public void addStudents(Student student) {
        Student[] newStudent = new Student[this.student.length+1];
        for (int i = 0; i < this.student.length; i++) {
            newStudent[i] = this.student[i];
        }
        this.student = newStudent;
    }
    public void removeStudents(String firstName, String lastName){
        Student[] newStudents = new Student[this.student.length -1];
        int indexRemove = 32;

        for (int i=0; i<this.student.length; i++){
            if (this.student[i].getFirstName().equals(firstName) && this.student[i].getFirstName().equals(lastName)){
                indexRemove = i;
                this.student[i] = null;
            }
            if (indexRemove == 32){
                System.out.println("Not found");
            }else {
                /*
                for (int i = 0; i < this.student.length && indexRemove < newStudents.length; i++, indexRemove++) {
                newStudents[indexRemove] = this.student[i];
                 */
                System.arraycopy(this.student, 0, newStudents, 0, indexRemove++);
                /*
                int elementsToCopy = this.student.length - 1 - indexRemove;
                System.arraycopy(this.student, indexRemove + 1, newStudents, indexRemove, elementsToCopy);
                 */
                System.arraycopy(this.student, indexRemove+1, newStudents, indexRemove,this.student.length-1-indexRemove);
                for (int j = this.student.length-indexRemove+1;1 <newStudents.length;i++ ){
                    newStudents[i] = null;
                }
            }
            this.student = newStudents;
        }
    }
//    public Map<Character, ArrayList<Student>> getGradeBook
}
