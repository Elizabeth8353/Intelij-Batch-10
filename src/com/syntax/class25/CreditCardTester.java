package com.syntax.class25;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(1000);
        creditCard.calculateInterest();

        Visa visa=new Visa(1000);
        visa.calculateInterest();

        AX ax=new AX(1000);
        ax.calculateInterest();

       // CreditCard creditCard1=new AX(120);// this is widening
       // creditCard1.calculateInterest();//method from child AX will be called

      //  AX ax1=(AX)new CreditCard(120);//narrowing we will get error at run time not possible on non primitive
    //not possible with non primitives run time error
     //   AX ax2=(AX)creditCard1;//storing back child class to its child datatype from line 14

    }
}
