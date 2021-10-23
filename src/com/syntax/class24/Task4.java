package com.syntax.class24;

public class Task4 {//ctrl+alt+enter= format
    private void sayHello(){
        System.out.println("Hello there");
    }
    private void sayHello(String name){
        System.out.println("Hello there"+name);
    }
    private void sayHello(String name, int time){
        for (int i = 0; i <time ; i++) {
            System.out.println("Hello"+name);
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("khfj",5);

    }
}
