package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//write the data in excel sheet...
		
		FileInputStream fis = new FileInputStream("./data/Test data.xlsx");
	  Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet("Sheet1");
	  
	   Row row = sheet.getRow(11);
	   //create the cell by using Row(I)
	   Cell cell = row.createCell(0);
	   //write a data into cell
	   cell.setCellValue("Pune");
	   
	   FileOutputStream fos = new FileOutputStream("./data/Test Data.xlsx");
	   wb.write(fos);
	   }
}
