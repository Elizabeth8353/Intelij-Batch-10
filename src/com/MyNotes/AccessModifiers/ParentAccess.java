package com.MyNotes.AccessModifiers;

public class ParentAccess {
    protected String name;
    protected int age;

    public ParentAccess(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void infoprint(){

        System.out.println("Protected method"+name+age);
    }

    public static void main(String[] args) {
ParentAccess parentAccess=new ParentAccess("lili",21);
parentAccess.infoprint();
    }
}
