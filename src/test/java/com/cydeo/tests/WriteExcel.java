package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class WriteExcel {

    String filePath="SampleData1212.xlsx";

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    @Test
    public void excel_write() throws IOException {

        //to read from excel we need to load it to fileInput stream
        FileInputStream fileInputStream=new FileInputStream(filePath);
        workbook=new XSSFWorkbook(fileInputStream);
        sheet=workbook.getSheet("employees");

        XSSFCell salaryCell=sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("salary");

        XSSFCell salary1=sheet.getRow(1).createCell(3);
        salary1.setCellValue(20000);

        XSSFCell salary2=sheet.getRow(2).createCell(3);
        salary2.setCellValue(20000);

        XSSFCell salary3=sheet.getRow(3).createCell(3);
        salary3.setCellValue(20000);

        XSSFCell salary4=sheet.getRow(4).createCell(3);
        salary4.setCellValue(20000);

        //TODO changes Salih Eren lastName to cobanoglu
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Salih Eren")){
                sheet.getRow(rowNum).getCell(1).setCellValue("cobanoglu");
            }

        }



        //open the write the file FileInputStream:reading
        //save changes            FileOutputStream:writing
      FileOutputStream outputStream=new FileOutputStream(filePath);
      //save/ writing changes in the workbook
        workbook.write(outputStream);

        //close all
        outputStream.close();
        workbook.close();


    }
}
