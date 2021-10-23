package com.syntax.class23.HW1;

public class AreaMethods {
    int length;
    int width;
    int height;

    void area(int length, int width){
        System.out.println("The area of a rectangle is "+(length*width));
    }
    void area(int a){
        System.out.println("Area of a square is "+(a*a));
    }

    void area(int length,int width,int height){
        System.out.println("Volume of box is "+(length*width*height));
    }

    public static void main(String[] args) {
        AreaMethods rectangle=new AreaMethods();
        rectangle.area(5,2);

        AreaMethods square=new AreaMethods();
        square.area(6);

        AreaMethods boxVolume=new AreaMethods();
       boxVolume.area(4,2,6);
    }


}
