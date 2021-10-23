package com.syntax.class25.Task1;

public class StudentTester {
    public static void main(String[] args) {
        Student[] student = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student s : student) {
                 s.Study();
                 s.lengthSchool();

        }
    }
}
