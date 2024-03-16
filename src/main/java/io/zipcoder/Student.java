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
        for (Double score : examScores) {
            StringBuilder append = sb.append("Exam " + (examScores.indexOf(score) + 1) + " -> " + score.intValue() + "\n");
        }
        return sb.toString();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);

    }

    public void setExamScores(int examNum, Double newScore) {
        examScores.remove(examScores.get(examNum - 1));
        examScores.add(examNum - 1, newScore);
    }

    public Double getAverageExamScore() {
        int sum = 0;
        for (Double sc : examScores) {
            sum += sc;
        }
        return Double.valueOf(sum / examScores.size());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student name: " + this.firstName + " " + this.lastName);
        stringBuilder.append("\n> Average Score: " + getAverageExamScore());
        stringBuilder.append("\n> Exam Scores:");
        for (int i = 0; i < examScores.size(); i++) {
            stringBuilder.append("\n Exam " + (i + 1) + " -> " + examScores.get(i).intValue());
        }
        return stringBuilder.toString();
    }
}
