package com.syntax.class25.Task1Class;

public class StudentTester {
    public static void main(String[] args) {
        //Polymorphisim is having different behaviours having different ships
        // behaving differently based on which object is calling those methods
    Student student= new Student();//we are storing Student obj
    student.study();// so we will get behaviours from Student obj
    student.doHomework();
    student.practice();

    Student student1=new SyntaxStudents();//if we change the obj to Syntax Student
        student1.study();//now we will get all the behaviours from our syntax class from our father container
        student1.doHomework();//will execute the Student method but with its Syntax implemented behaviour
        student1.practice();//not in obj(syntax)class but will take it from Student class
    }
}
