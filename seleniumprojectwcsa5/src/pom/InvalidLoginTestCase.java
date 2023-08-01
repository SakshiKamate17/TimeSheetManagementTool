package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import testNGAnnotation.BaseTest;

public class InvalidLoginTestCase extends BaseTest {
		
		private static final String EXCEL_PATH = null;

		public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
			// launch the browsers & application
			BaseTest bt = new BaseTest();
			bt.setUp();
			
		
			Object driver;
			//perform invalid Login
			// go into the login page
			Loginpage lp = new Loginpage();
			
			//read the data from excelFile
			Flib flib = new Flib();
			int rc = flib.getLastRowCount(EXCEL_PATH,"invalidcreds");
			
			for(int i=1;i<=rc;i++)
			{
			lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0),flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1));
			}
		}
}
