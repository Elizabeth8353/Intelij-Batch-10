package com.syntax.class19;

public class Student {
    /*Write a java program of Class Students that takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */
String name;
int grade1;
int grade2;
int grade3;
Student (String Sname,int gradeOne,int gradeTwo,int gradeThree){
    name=Sname;
    grade1=gradeOne;
    grade2=gradeTwo;
    grade3=gradeThree;
}
void CalculateAverageGrade(){
    int average=(grade1+grade2+grade3)/3;
    System.out.println("For "+name+" Your average is "+average);
}
}
