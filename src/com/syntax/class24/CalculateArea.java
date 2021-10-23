package com.syntax.class24;

public class CalculateArea {
    void calculateArea(double length,double width){
        System.out.println("Area "+(length*width));
    }

    void calculateArea(double length){
        System.out.println("Area "+(length*length));
    }
    void calculateArea(double length,double width, double height){
        System.out.println("Area "+(length*width*height));
    }
    public static void main(String[] args){
        CalculateArea calculateArea=new CalculateArea();
        calculateArea.calculateArea(10);
        calculateArea.calculateArea(10,10.2);
    }

}
