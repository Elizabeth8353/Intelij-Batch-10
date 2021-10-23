package com.syntax.class32.propertiesfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReadWriteDifferentFiles {
    public static void main(String[] args) throws IOException {
        //Path for our file where our file is located
        String readPath="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Config1.properties";//this path to read the file
        String writePath="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Config.properties";//this path to write the file
        //we want to open the file and read it
        //2 input streams because watever data is stored in these two files first we are getting that data
        FileInputStream fileInputStream=new FileInputStream(readPath);
        //before we write or add any data to our CONFIG we need line 17 to load our data present
        FileInputStream fileInputStream1=new FileInputStream(writePath);//to lead/copy current data in our COnfig
        //loading/saving our data from our CONFIG to not lose current data
        Properties properties1=new Properties();
        properties1.load(fileInputStream1);

        //loading data from our CONFIG1
        Properties properties=new Properties();
        properties.load(fileInputStream);
        //Reading data from CONFIG1
        String URL=properties.get("URL").toString();//converting that data in config 1 to string since properties is not string
        System.out.println(URL);

        //Writting "Url" as key and the URL value stored in line 26 from CONFIG1 as value
        properties1.put("Url",URL);//on config will give us this Url=www.google.com
        //we want to write new data in our Config so to save wat we write and not loose wat is currently on that file FileOutputStream is in the end
        FileOutputStream fileOutputStream=new FileOutputStream(writePath);//we are only writting on one file so one output stream
        properties1.store(fileOutputStream,"adding to ");

    }
}
