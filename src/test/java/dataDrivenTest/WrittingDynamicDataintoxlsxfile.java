package dataDrivenTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDynamicDataintoxlsxfile {

	public static void main(String[] args) throws IOException 
	{
		
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("sheet1");
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter No of rows:");
		int noofrows=sc.nextInt();
		
		System.out.println("Enter No of cells:");
		int noofcells=sc.nextInt();
			
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<noofcells;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\example2.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created:");
		
	}

}
