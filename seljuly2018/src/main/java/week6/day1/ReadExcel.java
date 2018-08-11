package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readExcel() throws IOException {
		//open the excel file using file path
		XSSFWorkbook wBook=new XSSFWorkbook("./data/login.xlsx");
		//open the particular sheet using name
		XSSFSheet sheet = wBook.getSheet("sheet1");
		//get the row count
		int rowCount = sheet.getLastRowNum();
		//get cell count using the row header 
		short cellCount = sheet.getRow(0).getLastCellNum();
		//read the data from excel file using row and column count
		//we use i=1 because,we dont want the row 0,its the row header
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellCount;j++) {
				XSSFCell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		wBook.close();
	}

}
