package day40_DataDrivenTestingUsing_MSExcel_ApachePOILibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _4WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {

		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_Random.xslx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
	 	
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell=row.createCell(4);
		
		cell.setCellValue("WELCOME");
			
		workbook.write(file);// Attach work book to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created with specific row and cell data");
	}

}
