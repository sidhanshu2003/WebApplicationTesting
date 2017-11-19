package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleTestData 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sys\\Desktop\\TestDataFile.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int i=0;i<=RowCount;i++)
		{
			Row r=sheet.getRow(i);
			int cellCount=r.getLastCellNum();
			for(int j=0;j<cellCount;j++)
			{
				Cell c=r.getCell(j);
				String testData=c.getStringCellValue();
				System.out.print(testData+"  ");
			}
			System.out.println();
		}
		
		

	}

}
