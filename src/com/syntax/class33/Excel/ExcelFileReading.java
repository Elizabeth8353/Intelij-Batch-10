package com.syntax.class33.Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Elizabeth\\OneDrive\\Desktop\\Batch10Excel\\TestFile1.xlsx";
        System.out.println(path);//if you want to double check the path just copy and paste on explorer

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rowCount=sheet.getPhysicalNumberOfRows();
        fileInputStream.close();
        for (int i = 1; i <rowCount ; i++) {
            int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j <cellCount ; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+" ");
            }
            System.out.println();//necessary so next row is printed on nextline
        }

    }
}
