package com.syntax.class18;

public class HW {
    /*Create a method that will accept an array as parameters and will return a sum of all elements from that array.
     Method should be visibly only within same package and accessible by the creating an instance of the class.
  Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.

     */
double sumArray(int [] arr){
    double sum=0;
    for(int array:arr){
        sum+=array;
    }

    return sum;
}
public static String reverse(String str){
    String r="";
    for (int i = str.length()-1; i>=0; i--) {
        r+=str.charAt(i);
    }

    return r;
}

private String newStr(String str){
    String vowels=str.replaceAll("[^aeiouAEIOU]","");
    return vowels;
    //or we can do  for shorter : return input.replaceAll("[^aeiouAeiou]",""];
}
public String rever(String in){
    return new StringBuilder(in).reverse().toString();
}

    public static void main(String[] args) {
        HW obj1=new HW();
        String obj=obj1.newStr("dtAEIOUkfn");
        System.out.println(obj);

        int[] a={5,1,4};
        HW obj2=new HW();
       double sum= obj2.sumArray(a);
        System.out.println(sum);

        HW obj3=new HW();
        String r=HW.reverse("Hello");
        System.out.println(r);
        HW task2=new HW();// line 50 and 51 together same as line 52
        System.out.println(task2.rever("sunday"));//same thing as line 52
        System.out.println(new HW().rever("sunday"));
    }
}