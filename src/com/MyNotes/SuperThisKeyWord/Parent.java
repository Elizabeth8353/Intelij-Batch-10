package com.MyNotes.SuperThisKeyWord;

public class Parent {
    String name;
    Parent(String name){
        this.name=name;
    }
}
class Child extends Parent{
//String name; if we don't have this instant var then we will use our parent name line 4 and when we initialize name
    //on line 23 but because we don't have name in child line 24 will override name in parent so everything will be Eli
    Child(String name) {
        super(name);
    }
    void printInfo(){
        System.out.println(name);//is coming from line 10 which is initiated on line 22
        System.out.println(this.name);//this. means instant from the class so also line 10 initiated on line 22
        System.out.println(super.name);//will be passed through child constructor line 21 and pass thought our parent constructor
        //and initiating our parent instant variable line 4 and since we are saying Super we are calling parent name
    }

    public static void main(String[] args) {
        Child child=new Child("Elizabeth");
        child.name="Eli";
        child.printInfo();

    }
}
