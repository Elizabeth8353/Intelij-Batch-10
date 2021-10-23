package com.syntax.class32.propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo {
    public static void main(String[] args) throws IOException {
        //Path of the file we want to interact with/ locating our file/location of our file
        String path="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Config.properties";

        //to navigate to that specific file in our path/creating a connection between class or navigation to that file
        FileInputStream fileInputStream=new FileInputStream(path);//if you

        //now we need a specific program to interact with that file/choosing a program to open that file
        Properties properties=new Properties();//Properties extends to hashtable
        //opening the file
        properties.load(fileInputStream);
        //reading the data
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));


    }
}
