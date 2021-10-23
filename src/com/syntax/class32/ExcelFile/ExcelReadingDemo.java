package com.syntax.class32.ExcelFile;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadingDemo {
    public static void main(String[] args) throws IOException {
        //this excel file is on my Desktop to get path (right click and go to properties and copy path add .xlsx to path for excel)
        String path="C:\\Users\\Elizabeth\\OneDrive\\Desktop\\Batch10Excel\\Java32class.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        //need the class to handle the excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        //to get to the sheet on your excel file currently working on
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");//navigating inside this sheet
        Row row=sheet.getRow(0);//from the sheet we are getting the individual rows 0
        System.out.println(row.getCell(0));//from the row we are getting the individual cells
        System.out.println(row.getCell(1));
       // System.out.println(row.getCell(2));//in excel all the numbers stored are treated as double if we want int we need to covert
        //to convert that double on row 0 cell 2 into int
        String cell2=row.getCell(2).toString(); // converting into String
        Double var=Double.parseDouble(cell2);//converting my string into double
        int var2=(int)Math.floor(var);//converting my double into int
        System.out.println(var2);

    }
}
