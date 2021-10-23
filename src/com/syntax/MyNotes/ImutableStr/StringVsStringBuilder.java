package com.syntax.MyNotes.ImutableStr;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String str="ABCD";
        System.out.println(str.concat("Z"));//nothing is created in the memory we did not store it  we are simply are
        // displaying the results
        System.out.println(str);//the content is ABCD it is not updated or changed to ABCD because we are not storing it

        StringBuilder str2= new StringBuilder("ABCD");
        System.out.println(str2.append("Z"));//Since Stringbuilder is mutable
        System.out.println(str2);// the original value is changed

        StringBuffer str3=new StringBuffer("hello");//String buffer has syncronization
        //when ever we are trying to change the value of str3 from multiple processors or threads this string class
        //will have that mecanisim that comunicated will comunicate with all the processor and thread then it will

        //string and strinbuilde they are not thread safe or syncrpb7

    }
}
