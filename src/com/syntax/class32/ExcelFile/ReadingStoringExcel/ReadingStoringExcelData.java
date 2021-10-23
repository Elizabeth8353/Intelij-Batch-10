package com.syntax.class32.ExcelFile.ReadingStoringExcel;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingStoringExcelData {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Elizabeth\\OneDrive\\Desktop\\Batch10Excel\\TestFile.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rows=sheet.getPhysicalNumberOfRows();// total number of rows in our excel file
        System.out.println(rows);//5
        int cells=sheet.getRow(0).getPhysicalNumberOfCells();//gets us number of cells in our row 0
        System.out.println(cells);//3
        System.out.println();
        ArrayList<Person> arrayList=new ArrayList<>();
        for (int i = 0; i <rows ; i++) {
            String firstName=sheet.getRow(i).getCell(0).toString();
            String lastName=sheet.getRow(i).getCell(1).toString();
            String age=sheet.getRow(i).getCell(2).toString();
            Person person=new Person(firstName,lastName,age);
            arrayList.add(person);
        }
        System.out.println(arrayList);

    }
}
