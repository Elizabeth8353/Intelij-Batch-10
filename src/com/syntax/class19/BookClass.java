package com.syntax.class19;

public class BookClass {
    /*Write program as a Book class   that will have instance variables and 2 Constructors.
    While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    String book;
    int price;
    boolean heavy;

    BookClass(String book){
        this.book=book;
        price=25;
        heavy=true;
    }
    BookClass(String book,int price,boolean heavy){
        this(book);
        this.price=55;
        this.heavy=heavy;

    }

    public static void main(String[] args) {
        BookClass obj1=new BookClass("note book");
        System.out.println("Title of book is: "+obj1.book);
        System.out.println("Price is $"+obj1.price);
        System.out.println("Is the book heavy "+ obj1.heavy);

        BookClass obj2=new BookClass("Princess Diaries",65,false);
        System.out.println("Title of book is: "+obj2.book);
        System.out.println("Price is $"+obj2.price);
        System.out.println("Is the book heavy "+ obj2.heavy);

    }
}
