package com.syntax.class25.ObjCasting;

public class Fawad extends Father {
    Fawad(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" like to sleep 8");
    }
    void eat(){
        System.out.println(name+"like to eat Rice");
    }
    void cries(){
        System.out.println(name+" Cries when he wants bottle");
    }
}
