package com.syntax.class19;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person1=new Person("Elizabeth",30);
        person1.printInfo();

        Scanner scan=new Scanner(System.in);
        Person person2=new Person(scan.nextLine(),scan.nextInt());
        person2.printInfo();

    }
}
