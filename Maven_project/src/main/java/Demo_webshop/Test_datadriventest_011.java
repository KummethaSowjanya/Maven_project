package Demo_webshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_datadriventest_011 {

	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com");
		driver.findElement(By.id("nav_automobile")).click();
		FileInputStream file=new FileInputStream("C:\\Users\\sowjanya.k\\OneDrive - Rootshell Enterprise Solutions Inc\\Desktop//tricentis sheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	//ENTER VEHIVLE DATA6
		int rowcount=	sheet.getLastRowNum();
		System.out.println(rowcount);
		for(int i=3;i<=rowcount;i++) {
			XSSFRow  row=sheet.getRow(i);

			String name= row.getCell(0).getStringCellValue();
			int engine= (int) row.getCell(1).getNumericCellValue();
			String date=workbook.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
			int seat=(int) row.getCell(3).getNumericCellValue();
			String fuee= row.getCell(4).getStringCellValue();
			int price=(int) row.getCell(5).getNumericCellValue();
			int plateno=(int) row.getCell(6).getNumericCellValue();
			int milage=(int) row.getCell(7).getNumericCellValue();


			// WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement dropdown=	driver.findElement(By.xpath("//select[@id='make']"));
			Select se=new Select(dropdown);
			se.selectByVisibleText(name);

			driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys(String.valueOf(engine));
			driver.findElement(By.id("dateofmanufacture")).sendKeys(date);

			Select se3 =new Select(driver.findElement(By.id("numberofseats")));
			se3.selectByVisibleText(String.valueOf(seat));

			WebElement fuel1=	driver.findElement(By.xpath("//select[@id='fuel']"));
			Select se4 =new Select(fuel1);
			se4.selectByVisibleText(fuee);
			driver.findElement(By.id("listprice")).sendKeys(String.valueOf(price));
			driver.findElement(By.id("licenseplatenumber")).sendKeys(String.valueOf(plateno));
			driver.findElement(By.id("annualmileage")).sendKeys(String.valueOf(milage));
			Thread.sleep(3000);
			driver.findElement(By.id("nextenterinsurantdata")).click();


//   ENTER INSURENCE DATA
//  **********************************
			int rowcount1=	sheet.getLastRowNum();
			System.out.println(rowcount1);
			for(int j=7;j<=rowcount1;j++) {
				XSSFRow  row1=sheet.getRow(j);

				String   Firstnm= row1.getCell(0).getStringCellValue();
				String lastnm= row1.getCell(1).getStringCellValue();
				String date1=workbook.getSheet("Sheet1").getRow(7).getCell(2).getStringCellValue();
				//String Gender=row1.getCell(3).getStringCellValue();
				String   address= row1.getCell(4).getStringCellValue();
				String   contry= row1.getCell(5).getStringCellValue();
				int Zipcode=(int) row1.getCell(6).getNumericCellValue();
				String   City= row1.getCell(7).getStringCellValue();
				String  ocupation= row1.getCell(8).getStringCellValue();


				driver.findElement(By.id("firstname")).sendKeys(Firstnm);
				driver.findElement(By.id("lastname")).sendKeys(lastnm);
				driver.findElement(By.id("birthdate")).sendKeys(date1);
				
			/*	List<WebElement> button=driver.findElements(By.xpath("//p[@class='group']"));
				int radiosize=button.size();
				for(int t=0;t<radiosize;t++) {
		String value=	button.get(t).getAttribute("value");
		if(value.equalsIgnoreCase(Gender)) {
			button.get(t).click();*/
				driver.findElement(By.xpath("(//span[@class='ideal-radio'])[2]")).click();
				driver.findElement(By.id("streetaddress")).sendKeys(address);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window,scrollBy(0,500)");

				Select country=new Select(driver.findElement(By.name("Country")));
				country.selectByVisibleText(contry);

				driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys(String.valueOf(Zipcode));
				driver.findElement(By.id("city")).sendKeys(City);

				Select work=new Select(driver.findElement(By.id("occupation")));
				work.selectByVisibleText(ocupation);
				driver.findElement(By.xpath("(//span[@class='ideal-check'])[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("nextenterproductdata")).click();
				js.executeScript("window,scrollBy(0,-500)");

//ENTER PRODUCT DATA 6
//*****************************
				int rowcount2=sheet.getLastRowNum();
				System.out.println(rowcount2);
				for(int r=11;r<=rowcount2;r++) {
					XSSFRow row2=sheet.getRow(r);
					String date3=row2.getCell(0).getStringCellValue();

					String insurence=row2.getCell(1).getStringCellValue();
					String merit=row2.getCell(2).getStringCellValue();
					String damage=row2.getCell(3).getStringCellValue();	
					String cortosycar=row2.getCell(5).getStringCellValue();	

					driver.findElement(By.id("startdate")).sendKeys(date3);
					Select ins=new Select(driver.findElement(By.id("insurancesum")));
					ins.selectByVisibleText(String.valueOf(insurence));

					Select me=new Select(driver.findElement(By.id("meritrating")));
					me.selectByVisibleText(merit);

					Select dmg=new Select(driver.findElement(By.id("damageinsurance")));
					dmg.selectByVisibleText("No Coverage");
					driver.findElement(By.xpath("(//span[@class=\"ideal-check\"])[6]")).click();

					js.executeScript("window,scrollBy(0,500)");

					Select ca=new Select(driver.findElement(By.xpath("//select[@id='courtesycar']")));
					ca.selectByVisibleText(cortosycar);
					driver.findElement(By.id("nextselectpriceoption")).click();

					// Select price option
					driver.findElement(By.xpath("(//label[@class=\"choosePrice ideal-radiocheck-label\"])[2]")).click();
					WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
					WebElement nxt = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='next'])[3]")));
					nxt.click(); 

	// Send Quote 4
	//****************
					int rowcount3=sheet.getLastRowNum();
					System.out.println(rowcount3);
					for(int s=17;s<=rowcount3;s++) {
						XSSFRow row3=sheet.getRow(s);

						String Email=row3.getCell(0).getStringCellValue();
						int phone=(int) row3.getCell(1).getNumericCellValue();
						String Username=row3.getCell(2).getStringCellValue();
						String Password=row3.getCell(3).getStringCellValue();
						String Conformpassword=row3.getCell(4).getStringCellValue();
						String comments=row3.getCell(5).getStringCellValue();

						driver.findElement(By.xpath("//input[@id='email']"))	.sendKeys(Email);
						driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(String.valueOf(phone));
						driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
						driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
						driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys(Conformpassword);
						driver.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys(comments);
						driver.findElement(By.xpath("//button[@id='sendemail']")).click();



					}

				}

			}

		}
	}

	
}




