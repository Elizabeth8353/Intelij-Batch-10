package com.syntax.class27.abstractDemo;

public abstract class Vehicle {//to be able to have abstract methods need abstract class
    //when we do not know the specification of a method we do abstract
    //inheritance is required to implement abstract methods
    //no final or private or static can be used with abstract methods since they don't participate in inheritance
    //cannot create a class directly from an abstract class
    String vinNumber;
    static int totalNumberOfVehicle;
    Vehicle(String vinNumber){
        this.vinNumber=vinNumber;
        totalNumberOfVehicle++;
        System.out.println("Vehicle Constructor");
    }


    static void displayTotalVehicles(){
        System.out.println("We build "+totalNumberOfVehicle+" Vehicles");
    }
    public void drive(){
        System.out.println("we can drive Vehicle");
    }

   protected void stop(){
       System.out.println("Vehicle can stop");
   }
   public abstract void start();
    abstract void speed();
  //  public static abstract void gps(); since it can't be overridden our abstract will stay incomplete
   // private abstract void gps(); private not participates in inheritance is
    //final
}
abstract class Car extends Vehicle{
String carType;
    Car(String carType,String vinNumber) {
        super(vinNumber);
        this.carType=carType;
        System.out.println("Car constructor");
    }
  //  @Override
   // void start(){ In inheritance cannot decrease visability if public cant decrease to default
    //}
    @Override
    public void speed(){// but can increase visibility
        System.out.println("Max speed is 400");
    }
    public abstract void breaking();
}
class BMW extends Car{
    String make;
    String model;

    public BMW(String carType, String vinNumber, String make, String model) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
        System.out.println("BMW constructor");
    }
    public void start(){
        System.out.println("BMW can start remotely");
    }
    public void breaking(){
        System.out.println("BMW can break");
    }
    public void displayInfo(){
        System.out.println("We build"+make+" "+model+" "+"with car type "+carType);
    }
}
class Toyota extends Car{
    String make;
    String model;

    public Toyota(String carType, String vinNumber, String make, String model) {
        super(carType, vinNumber);
        this.make = make;
        this.model = model;
    }
    public void start(){
        System.out.println("Toyota can start remotely");
    }
    public void breaking(){
        System.out.println("Toyota can break");
    }
    public void displayInfo(){
        System.out.println("we build "+make+" "+model+" with car type "+carType+" with VinNumber "+vinNumber);
    }
}
