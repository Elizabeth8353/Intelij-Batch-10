package com.syntax.class32.ExcelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrittingDemo3 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Elizabeth\\OneDrive\\Desktop\\Batch10Excel\\MyOwnFile.xlsx";//creating a new file in our Batch10Excel folder by entering new name in file


        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet mySheet=xssfWorkbook.createSheet("MySheet");
        Row myRow=mySheet.createRow(0);
        Cell myCell=myRow.createCell(0);
        myCell.setCellValue("My First File");
        FileOutputStream  fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}
