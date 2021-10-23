package com.syntax.class19;

public class Cat {
    String name;
    int age;
    double height;
    double weight;

    Cat(String name,int age,double height,double weight){
       // name=name; //when you parameter and local var is same then your instance var are ignored since
        //priority is given to your local var over instance
        this.name=name;//.this() help us destinguish our instant var
        this.age=age;
        this.height=height;
        this.weight=weight;
        printInfo(); //we can call our methods through our constructor to

    }
    void printInfo(){
        String name="Local var";//
        System.out.println("Name local "+name+" instance var "+this.name+" Age "+age+" Height "+height+"Weight "+weight);
    }

}
