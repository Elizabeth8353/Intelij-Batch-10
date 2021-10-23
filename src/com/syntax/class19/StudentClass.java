package com.syntax.class19;

public class StudentClass {
    String name;
    String address;

    StudentClass(String Sname, String Saddress) {
        name = Sname;
        address = Saddress;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        StudentClass studentClass=new StudentClass("Eli","828 Greensboro Dr. MClan va");
        studentClass.displayInfo();

    }
}
