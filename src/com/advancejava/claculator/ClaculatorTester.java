package com.advancejava.claculator;

import java.util.Scanner;

public class ClaculatorTester {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Calculator calculator1=new Calculator();
        Scanner scanner=new Scanner(System.in);
        double x,y;
        System.out.println("Please Enter a value for x: ");
        x=scanner.nextDouble();
        System.out.println("Please Enter a value for y: ");
        y=scanner.nextDouble();
        System.out.println("before any operations, value= "+calculator.getValue());
        calculator.add(12);
        System.out.println("value= "+calculator.getValue());
        calculator.multiply(x);
        calculator.multiply(x);
        calculator.multiply(x);
        System.out.println("value= "+calculator.getValue());
        calculator1.add(3);
        calculator1.multiply(y);
        calculator1.multiply(y);
        calculator.add(5);
        System.out.println("value= "+calculator.getValue());
        calculator.subtract(calculator1.getValue());
        System.out.println("value= "+calculator.getValue());
        calculator1.clear();
        calculator1.add(4);
        calculator1.multiply(y);
        calculator1.add(x);
        calculator.divide(calculator1.getValue());
        System.out.println("value= "+calculator.getValue());



    }
    }

