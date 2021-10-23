package com.syntax.class26.AbstractionDemo;

public abstract class Phone {
    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending a message");
    }
   public abstract void takepics();// to have abstract methods we need abstract class
    public abstract void unlock();


}
class Iphone extends Phone{
    @Override
    public void takepics(){
        System.out.println("take a pic with iphone");
    }
    public void unlock(){
        System.out.println("unlocked with face ID");
    }
}
class Samsong extends Phone{
    @Override
    public void takepics(){
        System.out.println("take pic with samsung");
    }
    @Override
    public void unlock(){
        System.out.println("unlock with fingerprint");
    }
}
class PhoneTester{
    public static void main(String[] args) {
        //Phone phone=new Phone(); we cannot obj from abstract class but if another class inherits from that
        //abstract class and implement those abstract methods only then we can create obj

        Phone phone=new Samsong();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takepics();
        phone.unlock();
    }
}
