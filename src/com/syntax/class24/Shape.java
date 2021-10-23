package com.syntax.class24;

public class Shape {
    double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

}
class Circle extends Shape{

    public Circle(double radius) {
        super(radius);
    }
    void area(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }

    public static void main(String[] args) {

    }
}
