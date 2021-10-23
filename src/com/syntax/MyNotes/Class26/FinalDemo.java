package com.syntax.MyNotes.Class26;

final public class FinalDemo {
    int age;
FinalDemo(int age){
    this.age=age;
}
    public static void main(String[] args) {
        FinalDemo finalDemo=new FinalDemo(10); //we can make an obj out of a final class
        finalDemo.age=5;
        System.out.println(finalDemo.age);
    }

}
//class Child extends FinalDemo{
    // cant inherit from final class
//}
