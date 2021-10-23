package com.syntax.class26.InterfaceDemo;

import com.syntax.class26.AbstractionDemo.Phone;

public interface CallAble {
    // by default public static final
    void method();

}
abstract class  Phone1{
    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending a message");
    }
    public abstract void takepics();// to have abstract methods we need abstract class
    public abstract void unlock();
}
class Iphone extends Phone1 implements CallAble{
    @Override
    public void method(){
        System.out.println("In Iphone child class from interface class");
    }
    @Override
    public void takepics(){
        System.out.println("take a pic with iphone");
    }
    @Override
    public void unlock(){
        System.out.println("unlocked with face ID");
    }
}
