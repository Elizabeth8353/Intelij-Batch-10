package com.syntax.class26.Task2;

public class FileTester {
    public static void main(String[] args) {

    File file1=new PDFFile();
    file1.open();
    file1.edit();
    file1.close();
        System.out.println("=======================================");

    File[] files={new JavaFIle(),new WordFile(),new PDFFile()};
        for (int i = 0; i <files.length ; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }
}
}

