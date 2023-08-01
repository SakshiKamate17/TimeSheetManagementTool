import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://desktop-a0pfmeg/user/submit_tt.do");
    
    //read the data from excel file and test the login page
    FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sheet = wb.getSheet("validcreds");
Row row = sheet.getRow(1);
Cell cell = row.getCell(0);
String validUsername=cell.getStringCellValue();

Thread.sleep(2000);

FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
Workbook wb1 = WorkbookFactory.create(fis);
Sheet sheet1 = wb.getSheet("validcreds");
Row row1 = sheet.getRow(1);
Cell cell1 = row.getCell(0);
String validUsername1=cell.getStringCellValue();

Thread.sleep(2000);
	}
}
