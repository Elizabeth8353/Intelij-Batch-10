package com.syntax.class19;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student("Eli",75,90,80);
        student.CalculateAverageGrade();

        Student student1=new Student("Bri",60,40,30);
        student1.CalculateAverageGrade();

        Student student2=new Student("Gia",80,80,90);
        student2.CalculateAverageGrade();

        Student student3=new Student("Vic",80,100,90);
        student3.CalculateAverageGrade();
    }
}
