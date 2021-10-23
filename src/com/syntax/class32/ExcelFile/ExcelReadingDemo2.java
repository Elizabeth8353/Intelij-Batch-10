package com.syntax.class32.ExcelFile;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadingDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Elizabeth\\OneDrive\\Desktop\\Batch10Excel\\Java32class.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rowCount=sheet.getPhysicalNumberOfRows();//give me actual # of rows that contins the data in sheet 1 so their is 4 rows that contain data in our excel sheet
        System.out.println(rowCount);//this method gives us the actual number of rows in our sheet1 which data is in  4 rows
        for (int i = 0; i <rowCount ; i++) {
          int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();//once in our current row i with this method we get cell count of our current row
           // System.out.println(cellCount); =3   3   3  3
            for (int j = 0; j <cellCount ; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+" ");//we are not printing row we are printing cell becuse that is waht holds our data
            }
            System.out.println();
        }
    }
}
