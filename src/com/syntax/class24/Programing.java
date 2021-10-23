package com.syntax.class24;

public class Programing { //shift +f6 = to rename

    Programing(){
        System.out.println("I love programing languajes");
    }
    Programing(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {
        Programing programing=new Programing();// better to store in variable when you will be calling other methods in class
        new Programing("Phython");//creation of object or obj creation when you are sure you will not be calling anyonther methods
    }
}
