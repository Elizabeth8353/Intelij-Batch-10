package com.syntax.class32.propertiesfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWrittingDataDemo {
    public static void main(String[] args) throws IOException {
        //finding our file path/file location
        //path where we want to create the file in my computer
        String path="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Config1.properties";//added 1 after Config to add a new file our program creates it automatically
        // if we don't change name we will override the current Config file

        //navigating to the path and creating a new file
        //if we want to write the data use fileoutputstream
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //opening the specific program and putting the data
        //chose the program to handle that file
        Properties properties=new Properties();
        properties.put("URL","www.google.com");//putting this data
        //saving changes to that file
        properties.store(fileOutputStream,"New data added");
    }
}
