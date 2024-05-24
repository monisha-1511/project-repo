package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mvn {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Class\\excelsheet\\LOGIN.xlsx");
		FileInputStream fI = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fI);

		Sheet sheet = w.getSheet("LOGIN");
		Row row = sheet.getRow(2);

		Cell cell = row.getCell(0);
		System.out.println(cell);

	}
public void method1() {

	
}
public void method2() {
	System.out.println("method");

}


}
