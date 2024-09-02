package day40_DataDrivenTestingUsing_MSExcel_ApachePOILibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _3WritingDynamicDataToExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_Dynamic.xslx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter howmany rows?");
		int noOfRows=sc.nextInt();
		
		System.out.println("Enter howmany cells?");
		int noOfCells=sc.nextInt();
		
		for(int r=0;r<=noOfRows;r++)
		{
			XSSFRow currentRow= sheet.createRow(r);
			
			for(int c=0;c<noOfCells;c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
			
		workbook.write(file);// Attach work book to the file
		workbook.close();
		file.close();
		
		System.out.println("File is created with dynamic data");

	}

}