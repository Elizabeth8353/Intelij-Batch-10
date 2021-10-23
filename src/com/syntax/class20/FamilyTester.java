package com.syntax.class20;

public class FamilyTester {
    public static void main(String[] args) {
        Parent mom = new Parent();

        mom.eat();
        mom.works();
        mom.sleeps();

        Grandpa pop=new Grandpa();
        pop.eat();
        pop.sleeps();

        Child baby=new Child();
        baby.eat();
        baby.school();
        baby.sleeps();
    }

}
