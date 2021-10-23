package com.syntax.class23.HW2;

public class PrivateOverload {
    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void print(String str){
        System.out.println("I can't wait for the 6 months to be "+str);
    }
    private void print(int i,int j){
        do{
            System.out.println("I love Java");
            i++;
        }while(i<=j);
    }

    private void print(double i,double j){
        System.out.println(i/j);
    }

    public static void main(String[] args) {
        PrivateOverload obj1=new PrivateOverload();
        obj1.print("over");

        PrivateOverload obj2=new PrivateOverload();
        obj2.print(2,4);

        PrivateOverload obj3=new PrivateOverload();
        obj3.print(10.2,3.2);
    }
}
