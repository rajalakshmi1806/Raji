package exceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public Object[][] readExcel(String fileName) throws IOException {
		//open Excel from File Path
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//Go to Sheet with index 0
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Find the Row count
		int rowCount = sheet.getLastRowNum();
		//Find the Cell count
		short columnCount = sheet.getRow(0).getLastCellNum();
		//Read the Data
		Object[][] data = new Object[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);//entered ith row
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);//entered cell
				 data[i-1][j] = cell.getStringCellValue();//fetch data
				//System.out.println(data);
			}
		}
		wBook.close();
		return data;
	}

	
	
	
	
	
	
	
	

}