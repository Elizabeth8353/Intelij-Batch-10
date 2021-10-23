package com.MyNotes.FibonacciSeries;

public class FirstWay {
    //Write a java program to print first 10 numbers of fibonacci series
    //{0, 1,  1,  2,  3,  5,  8,  13,  22,  35,}
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i <=10 ; i++) {
            System.out.print(a+" ");//0,  1,  1,  2, 3, 5, 8, 13, 21, 34, 55
            c=a+b;//1, 2, 3, 5, 8, 13, 21, 34, 55
            a=b;//1, 1, 2, 3, 5, 8, 13, 21, 34, 55
            b=c;//1, 2, 3, 5, 8, 21, 34, 55
        }

        System.out.println("========Secound way==================");
int f1=0;
int f2=1;
        for (int i = 0; i <10 ; i++) {
            System.out.println(f1);//0,1,1,2,3,5,8
            f1=f1+f2;//f1(0)=0+1= 1; f1(1)=f1(1)+f2(0)= 1; f1(1)=f1(1)+f2(1)=2; f1(2)=f1(2)+f2(1)=3; f1(3)=f1(3)+f2(2)=5;f1(5)=f1(5)+f2(3)=8
            f2=f1-f2;//f2(1)=f1(1)-f2(1)=0; f2(0)=f1(1)-f2(0)=1; f2(1)=f1(2)-f2(1)=1; f2(1)=f1(3)-f2(1)=2;f2(2)=f1(5)-f2(2)=3;f2(3)=f1(8)-f2(3)=5;

        }

    }
}
