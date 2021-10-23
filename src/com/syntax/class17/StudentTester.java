package com.syntax.class17;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId="1";
        student.studentName="Michael";
        Student.numberofStudent++;

        Student student1=new Student();
        student1.studentName="Serge";
        student1.studentId="2";
        Student.numberofStudent++;

        Student student2=new Student();
        student2.studentName="eli";
        student2.studentId="3";
        Student.numberofStudent++;

    }
}
