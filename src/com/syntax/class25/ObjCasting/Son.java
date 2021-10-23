package com.syntax.class25.ObjCasting;

public class Son extends Father {
    Son(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" like to sleep 20 hours a day");
    }
    void eat(){
        System.out.println(name+" Like to eat quabilly");
    }
    void playGames(){
        System.out.println(name+" I can play in computer");
    }
}
