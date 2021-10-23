package com.syntax.class32.propertiesfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadWriteDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Elizabeth\\IdeaProjects\\JavaBatch10\\Files\\Config.properties";

        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("UserName"));//reading from config
        System.out.println(properties.get("Password"));//reading from config
        properties.put("Name","Elizabeth");//writting in config
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"Name added to this file");

    }
}
