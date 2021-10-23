package com.syntax.class24;

public class Overloading {
    void sayHello(){
        System.out.println("Hello");
    }
  //  private void sayHello(){
        //
  //  }
  public static void main(String[] args) {
      System.out.println("Inside the main method with String[] args");
      main("Hello ");
      main(10);
  }

    public static void main(String args) {
        System.out.println("Inside the main method with String arg");
    }

    public static void main(int args) {
        System.out.println("Inside the main method with int arg");
    }
}
