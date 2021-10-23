package com.syntax.class29.Abstract;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {
        Flowers[] flowers={new Rose("Rose","Pink"),new Tulip("Tulip","Red")};
        ArrayList<Flowers> flowers1=new ArrayList<>();
        flowers1.add(new Rose("Rose","Pink"));
        flowers1.add(new Tulip("Tulip","Red"));
        flowers1.add(new SunFlowers("SunFlower","Yellow"));

    }
}
