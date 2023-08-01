package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-a0pfmeg/login.do");
	
	//to read valid username from validcreds sheet
	 FileInputStream fis = new FileInputStream("./data/ActiTime Test Data.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet("validcreds");
	 Row row = sheet.getRow(0);
	 Cell cell = row.getCell(0);
	 String username=cell.getStringCellValue();
	 

		//to read valid password from validcreds sheet
		 FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		 Workbook wb2 = WorkbookFactory.create(fis);
		 Sheet sheet2 = wb.getSheet("validcreds");
		 Row row2 = sheet.getRow(0);
		 Cell cell2 = row.getCell(0);
		 String password=cell2.getStringCellValue();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys("password");
		 driver.findElement(By.id("loginButton")).click();
	}

}
