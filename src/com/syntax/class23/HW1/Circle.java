package com.syntax.class23.HW1;

public class Circle extends Shape {

    Circle(double radius) {
        super(radius);

    }
        /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code.
9:57
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
     */
    void area(){

        System.out.println(Math.PI*(super.radius*super.radius));
    }


    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.area();
    }

}
