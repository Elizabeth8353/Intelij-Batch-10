package com.syntax.class29.Abstract;

public abstract class Flowers {
    String type;
    String color;

    public Flowers(String type,String color){
        this.type=type;
        this.color=color;
    }
    public abstract void bloom();
}
class Rose extends Flowers{

    public Rose(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {//we can increase accesability not decrease
        System.out.println(type+" Blooms in May");
    }
}
class Tulip extends Flowers{

    public Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+" Blooms in March");
    }
}
class SunFlowers extends Flowers{

    public SunFlowers(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(type+" Blooms in Augutst");
    }
}
