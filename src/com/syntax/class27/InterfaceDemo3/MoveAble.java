package com.syntax.class27.InterfaceDemo3;

public interface MoveAble {
    void move();
}
interface ControlAble{
    void control();

}
interface SellAble {
    void sell();

}
interface AnotherInterface{
    void sell();
}
interface Car extends MoveAble,ControlAble,SellAble,AnotherInterface{
    public void sell();

    }
class Toyota implements SellAble,AnotherInterface{
    public void sell(){
        System.out.println("you can sell this ");
    }
}

