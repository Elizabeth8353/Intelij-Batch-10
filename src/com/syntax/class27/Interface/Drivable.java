package com.syntax.class27.Interface;

public interface Drivable {
    //No constructors needed since no instance fields and constructor is used to initialize our instance and static fields
    //abstract only applicable to classes and methods
    boolean Fast=true;//all variables are public and static and final no need to mention them
    // because they are applied by default
   public abstract void drive();
    //all methods are public and abstract no need to specify

}
abstract class Car{
    public void stop(){
        System.out.println("A car can stop");
    }
    public abstract void start();
}
class Mercedes extends Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("Mercedez can drive");
    }

    @Override
    public void start() {
        System.out.println("Mercedez can start");
    }
}
