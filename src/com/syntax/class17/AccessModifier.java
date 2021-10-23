package com.syntax.class17;

public class AccessModifier {
    private String name;
    int age;
    protected int height;
    public boolean b;

    private void method1(){
        System.out.println(name);
        System.out.println(age);
    }
    void method2(){
        System.out.println(name);
        System.out.println(age);
    }
    protected void method4(){
        System.out.println(name);
        System.out.println(age);
    }
    public void method3(){
        method4();
        System.out.println(age);
        System.out.println(height);
    }


    public static void main(String[] args) {
        AccessModifier obj=new AccessModifier();
        obj.name="hi";//cannot access private fiels directly need
        //reference obj same as private methods
    }
}
