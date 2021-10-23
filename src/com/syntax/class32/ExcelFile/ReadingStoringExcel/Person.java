package com.syntax.class32.ExcelFile.ReadingStoringExcel;

public class Person {
    String FirstName;
    String LastName;
    String Age;

    public Person(String FirstName, String LastName, String Age) {
       this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }
}
