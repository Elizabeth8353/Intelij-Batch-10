package com.Project3.Task1;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        System.out.println(Math.PI*(radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(Math.PI*2*radius);
    }
}
class Square implements Shape {
    int a;
    Square(int a) {
        this.a = a;
    }
    @Override
    public void calculateArea() {
        System.out.println(a*a);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4*a);
    }
}

