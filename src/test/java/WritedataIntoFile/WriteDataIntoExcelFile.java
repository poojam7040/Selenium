package WritedataIntoFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataIntoExcelFile {

	@Test
	public void writeData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\POOJA\\Desktop\\TestData.xlsx") ;
		
		Workbook wb = WorkbookFactory.create(fis) ;
		
		Sheet sheet = wb.getSheet("Twitter") ;
		
		Row row = sheet.getRow(2) ;
		
		Cell cell = row.createCell(2) ;
		
		cell.setCellType(CellType.STRING);
		
		cell.setCellValue("Pooja");
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\POOJA\\Desktop\\TestData.xlsx") ;
		
		wb.write(fout);
		
		wb.close(); 
		
		
	}
}
