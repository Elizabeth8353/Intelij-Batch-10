package com.syntax.class28.Encapsulation;

public class Person {
    private String name;
    private int age;
    private String SSN;
    //setters give a more security rules before initializing our variables
    void setName(String name){//setters are usually void
        if(name.length()<20){
            this.name=name;
        }else{
            System.out.println("Name can not be grater than 20 characters");
        }
    }
    void setAge(int age){
        if(age>0&&age<120){
            this.age=age;
        }else{
            System.out.println("age is not between 0 and 120");
        }
    }

    public void setSSN(String SSN) {
        if(SSN.length()==9){
            this.SSN=SSN;
        }else{
            System.out.println("wrong SSN");
        }
    }
    String getName(){
        System.out.println("succesful");
        return name;
    }

     int getAge(String SSN) {
        if(this.SSN.equals(SSN)){
            return age;
        }else {
            return 0;
        }

    }

    public String getSSN(String password) {
        if(password.equals("12345")){
            return this.SSN;
        }else {
            return null;//null means no memory address in this stack area
        }
    }
}
