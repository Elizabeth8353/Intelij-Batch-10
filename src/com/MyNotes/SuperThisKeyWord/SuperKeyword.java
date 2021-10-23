package com.MyNotes.SuperThisKeyWord;



public class SuperKeyword {
    //super() is use to call our parent contructer to initialize the fields in our parent constructed
    double PI=3.41;

    double calculateArea(double length,double width){
        return length*width;
    }

}

class Kid extends SuperKeyword{
    double area(double height,double width,double length){
        return height*super.calculateArea(length,width); //since we need to multiply length and width and that calculation
        //already exist in parent class then we can call it with super. but we don't really need super since we automatically
        //inherit everything but when overriding or conflict between fields or method in parent or child class with same name
        //we use it to distinguish
    }
    double calculateArea(double radius){
        return super.PI*radius*radius;
    }
}