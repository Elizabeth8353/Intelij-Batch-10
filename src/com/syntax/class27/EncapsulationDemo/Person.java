package com.syntax.class27.EncapsulationDemo;

public class Person {
    //Getter we use to get the values back from our fields
   private String name;
  private int age;
    private int weight;
   private int height;
public void setName(String name){
    if(name.length()<15){
        this.name=name;
    }else{
        System.out.println("Name not allowed");
    }
}
public void setAge(int age){
    if(age>0&&age<120){
        this.age=age;
    }else{
        System.out.println("Age out of range");
    }
}
public void setWeight(int weight){
    if(weight>0&&weight<150){
        this.weight=weight;
    }else{
        System.out.println("weight is out of range");
    }
}
String getName(){
    return name;
}
    void printInfo(){
        if(age==0){
            System.out.println("Something is wrong");
        }else{
            System.out.println("Name "+name+" Age "+age+" Weight "+weight+" Height "+height);
        }
    }
}
