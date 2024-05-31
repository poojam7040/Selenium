package DataDriverTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void readDataFromExcel() throws EncryptedDocumentException, IOException {
		
		File path = new File("C:\\Users\\POOJA\\Desktop\\TestData.xlsx") ;	
		
		FileInputStream readFile = new FileInputStream(path) ;
		
		Workbook we = WorkbookFactory.create(readFile);
		
		org.apache.poi.ss.usermodel.Sheet sheet1 = we.getSheet("Sheet1") ;
		
//		String gmail = sheet1.getRow(0).getCell(0).toString() ; 
//		
//		String pass = sheet1.getRow(0).getCell(1).toString() ; 
//		
//	    String ridhhiGmail = sheet1.getRow(1).getCell(0).toString() ; 
//		
//		String ridhhiPass = sheet1.getRow(2).getCell(0).toString() ; 
		
//		System.out.println(gmail);
//		
//		System.out.println(pass);
//		
//      System.out.println(ridhhiGmail);
//		
//		System.out.println(ridhhiPass);

		int row = sheet1.getPhysicalNumberOfRows()  ;
		//Row value must be 0 
		int  col = sheet1.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0 ; i<row ;i++ )
		{
			for(int j  = 0 ;j < col ;j++)
			{
				String data = sheet1.getRow(i).getCell(j).toString() ; 
				
				System.out.println(data);

			}
		}
	 }
	
	
}
