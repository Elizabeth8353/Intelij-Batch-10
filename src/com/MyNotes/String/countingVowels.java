package com.MyNotes.String;

public class countingVowels {
    public static void main(String[] args) {
        String str="hello my name is eli";

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
