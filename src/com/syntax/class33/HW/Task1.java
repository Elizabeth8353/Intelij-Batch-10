package com.syntax.class33.HW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    /*Create a property File to store the fallowing Configurations:
    -browser=chrome
    -url=http://facebook.com
    -username
    -password
    Read file and extract values of browser and url
     */

    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Hw.properties";
        String path=System.getProperty("user.dir")+"\\Files\\Hw.properties";//makes our code dinamic better way to do it
        System.out.println(path);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("browser","chrome");
        properties.put("url","http://facebook.com");
        properties.put("username","admin");
        properties.put("password","hrm123");
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));

        properties.store(fileOutputStream,"Entering Homework");
fileOutputStream.close();//always close its a good practice
    }
}
