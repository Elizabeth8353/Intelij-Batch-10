package com.syntax.class23.HW1;

public class Shape {
    /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code.
9:57
Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
     */

    double radius;

    Shape(double radius){
        this.radius=radius;
        System.out.println(radius/(Math.PI*2));
    }



}
