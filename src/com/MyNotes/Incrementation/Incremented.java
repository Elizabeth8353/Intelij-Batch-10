package com.MyNotes.Incrementation;

public class Incremented {
    public static void main(String[] args) {
        int i=10;
        System.out.println("++i = "+(++i + (++i)));// i=12 + (++i=11) =23


        int j=10;
        System.out.println("++i= "+(++i));//first increment the value then use it
        System.out.println("i++= "+(i++));//first use the value then increment
        System.out.println("i= "+i);//in the next line update value will reflect in i

        System.out.println("==========================================================");
        int a=10;
        int b=20;
        a=a+b;
        System.out.println("a=a+b; "+a);
        b+=a+b;//b=b(20)+a(30)+b(20)
        System.out.println("b+=a+b; "+b);
        System.out.println("=====================================");
        int e=0;
        while (e<=5){
            System.out.println(e);
           ++e; //does same as line 26
           // e++;
        }
    }
}
