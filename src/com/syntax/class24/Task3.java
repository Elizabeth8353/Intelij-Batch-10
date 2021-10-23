package com.syntax.class24;

public class Task3 {
    static void sayHello(){
        System.out.println("Hello there");
    }
    static void sayHello(String name){
        System.out.println("Hello there"+name);
    }
    static void sayHello(String name, int time){
        for (int i = 0; i <time ; i++) {
            System.out.println("Hello"+name);
        }
    }

    public static void main(String[] args) {
        sayHello("Eli",5);
    }

}
