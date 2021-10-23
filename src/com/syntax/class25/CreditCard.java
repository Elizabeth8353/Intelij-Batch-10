package com.syntax.class25;

public class CreditCard {
    double interest;
    double balance;

    public CreditCard(double balance) {//no need to initialize the interest because it will be different for each class
        this.balance = balance;
//calculateInterest(); when constructor is called it will automatically call this method
    }
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("Yearly interest is "+interest);
    }
}
class Visa extends CreditCard{

    public Visa(double balance) {
        super(balance);
    }
    //I will call the Parent method as well
}
class AX extends CreditCard{
    public AX(double balance) {
        super(balance);
    }
    //since this child override the parent method it will call its own method twice
    void myownMethod(){
        System.out.println("AX child method");
    }
@Override
    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Yearly interest is "+interest);
    }
}

