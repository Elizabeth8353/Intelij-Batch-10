package com.syntax.class25;

public class Degree {
    /*
    Create a class 'Degree' having a method 'get prequiset' that prints "to get a degree you need high school diploma"
    Class 'Degree' has 2 subclasses namely 'Bachelors' and 'Masters '. In Maters class override method 'Prequisit'
     */
    void getPrequisite(){
        System.out.println("To get a degree you need high school piploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPreqisites(){
        System.out.println("To get a Masters degree you need a Batchlors degree first");
    }
}
