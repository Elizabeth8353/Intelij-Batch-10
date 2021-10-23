package com.syntax.class16;

public class InstanceVarDemoTester {
    public static void main(String[] args) {
        InstanceDemo instanceDemo= new InstanceDemo();
        System.out.println(instanceDemo.sum);
        instanceDemo.sum();
        System.out.println(instanceDemo.sum);
        instanceDemo.calculatorAverage();
    }
}
