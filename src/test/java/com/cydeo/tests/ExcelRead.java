package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

@Test
    public void read_from_excel_file() throws IOException {

    String path="SampleData1212.xlsx";

    //to read from excel we need to load it to fileInput stream
    FileInputStream fileInputStream=new FileInputStream(path);

    //Workbook>sheet>row>cell

    //create a workbook object
    XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

    //2 we need to get specific sheet from currently opened workbook

    XSSFSheet sheet=workbook.getSheet("employees");

    //3 select row and cell
    //print out the Salih eren cell
    //index strats from 0
    System.out.println(sheet.getRow(1).getCell(0));

    //prin out developer
    System.out.println(sheet.getRow(2).getCell(2));


    //Return used count of cell only
    //starting counting from 1

    int usedRows=sheet.getPhysicalNumberOfRows();
    System.out.println(usedRows);

    //Return number from top to bottom cell
    //ıt doesnt care if cell is empty or not
    //it strats from 0
    int lastusedRow=sheet.getLastRowNum();
    System.out.println(lastusedRow);

    //TODO create o logic print Semih kaan's name
    for (int rowNum = 0; rowNum < usedRows; rowNum++) {

        if(sheet.getRow(rowNum).getCell(0).toString().equals("Semih kaan")){
            System.out.println(sheet.getRow(rowNum).getCell(0));
        }

    }

    //TODO create o logic print Semih kaan's name Asya JOB-ID
    //I f name is Asya , print out Asya's job_id

    for (int rowNum = 0; rowNum < usedRows; rowNum++) {

        if(sheet.getRow(rowNum).getCell(0).toString().equals("Asya")) {
            System.out.println("Asya job id is " + sheet.getRow(rowNum).getCell(2));// 2 is job id index
        }
        }

}

}
