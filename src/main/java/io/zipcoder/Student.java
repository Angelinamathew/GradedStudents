package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder sb = new StringBuilder();
        for (Double score : examScores){
            StringBuilder append = sb.append("Exam " + (examScores.indexOf(score) + 1) + "->" + score.intValue() + "\n";
        }
        return sb.toString();
    }

    public void setExamScores(int examNum, Double newScore) {
        examScores.add(examNum, newScore);
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);

    }

    public String getAverageExamScore() {

    }
}
