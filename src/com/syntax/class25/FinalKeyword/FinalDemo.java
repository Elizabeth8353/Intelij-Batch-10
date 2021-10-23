package com.syntax.class25.FinalKeyword;

public class FinalDemo {
    public static void main(String[] args) {
        final int num=10;//I can only assign value when we are initializing declaring this variable after that we can't change this value
      //num=20; CE we cannot change value to 20 because num is final and assigned to 10
        // example math.pi is final
        //final is constant when we want something to be constant and don't want something to change we make it final
        //90% static is used with final keyword
        // second use of final is with methods when you don't want your child classes overriding your behaviours or fields
        // third use is with class if final no other class can inherit from that class
    }
}
