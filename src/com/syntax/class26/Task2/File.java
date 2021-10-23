package com.syntax.class26.Task2;

public abstract class File {
    /*Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract. Create 3 subclasses:
    JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    abstract void open();
    void edit(){
        System.out.println("Edititing the file ");
    }
    void close(){
        System.out.println("File closed");
    }
}
class JavaFIle extends File{
    void open (){
        System.out.println("Use Intelli j to open this file");
    }
}
class PDFFile extends File{
    void open(){
        System.out.println("Use adobe PDF reader to open File");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("Use Ms Word To open this File n");
    }
}