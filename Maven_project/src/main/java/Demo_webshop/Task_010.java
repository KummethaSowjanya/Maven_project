package Demo_webshop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		// ENTER VEHICLE DATA
	//***********************************
		
		Boolean is= driver.findElement(By.xpath("(//section[@class='idealsteps-step'])[1]")).isEnabled();
		if(is==true) {
		System.out.println(is);
		// make ::: honda
		WebElement name=	driver.findElement(By.xpath("//select[@id=\"make\"]"));
		Select se =new Select(name);
		se.selectByVisibleText("Honda");
		// model::scooter
		WebElement name1=	driver.findElement(By.xpath("//select[@id='model']"));
		Select se1 =new Select(name1);
		se1.selectByVisibleText("Scooter");
		// cylinder capacity
		driver.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("1222");
		// engine performance
		driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("223");
		// select the calender
		 WebElement date=driver.findElement(By.id("opendateofmanufacturecalender"));
		 date.click();
		 Thread.sleep(3000);
		 WebElement date1=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[11]"));
		 date1.click();
           
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window,scrollBy(0,500)");
	// number of seats     
        WebElement seats=	driver.findElement(By.id("numberofseats"));
   		Select se2 =new Select(seats);
   		se2.selectByValue("3");
   	// click on button
   		driver.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click();
   // no of seats bike
        WebElement seats1=	driver.findElement(By.id("numberofseatsmotorcycle"));
   		Select se3=new Select(seats1);
   		se3.selectByValue("2");
   	// fuel
        WebElement fuel1=	driver.findElement(By.id("fuel"));
   		Select se4 =new Select(fuel1);
   		se4.selectByVisibleText("Petrol");
   		// payload
   		driver.findElement(By.id("payload")).sendKeys("124");
     //total weight
   		driver.findElement(By.id("totalweight")).sendKeys("5000");
   		//	listprice
   		driver.findElement(By.id("listprice")).sendKeys("10000");
   	     //	licenseplatenumber
   		driver.findElement(By.id("licenseplatenumber")).sendKeys("1242");
   		   //annualmileage
   		driver.findElement(By.id("annualmileage")).sendKeys("50000");
       // click on next button
   	    driver.findElement(By.id("nextenterinsurantdata")).click();
   	    
		}else {
			System.out.println("false");
		}
		
		
   	    //   ENTER INSURENCE DATA
   	  //  **********************************
		Boolean data= driver.findElement(By.xpath("//div[@class=\"idealsteps-container\"]")).isEnabled();
		if(data==true) {
		System.out.println(data);
		
   		driver.findElement(By.id("firstname")).sendKeys("sowjanya");
   		driver.findElement(By.id("lastname")).sendKeys("kummetha");
   // calander
   		String year ="2002";
   		int date=23;

   		WebElement date2=driver.findElement(By.id("opendateofbirthcalender"));
   		date2.click();
   	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
   	while(true) {
   		String  yeartext = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
  if(yeartext.equals(year)) {
	break;
  }else {
	  driver.findElement(By.className("ui-datepicker-prev")).click();
  }
   	}
   driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]"))	.click();
   
// click on radio button
	 	driver.findElement(By.xpath("(//span[@class='ideal-radio'])[3]")).click();
//street address
	 	driver.findElement(By.id("streetaddress")).sendKeys("nagar");
// country
	 	WebElement cou=driver.findElement(By.id("country"));
	 	Select country=new Select(cou);
	 	country.selectByVisibleText("India");
	// Zip code
	 	driver.findElement(By.id("zipcode")).sendKeys("3214");
	// city
	 	driver.findElement(By.id("city")).sendKeys("Anatapur");
	// occupation
	 	WebElement occu=driver.findElement(By.id("occupation"));
	 	Select work=new Select(occu);
	 	work.selectByVisibleText("Employee");
// check box
	 	driver.findElement(By.xpath("(//span[@class='ideal-check'])[1]")).click();
//website
	 		driver.findElement(By.id("website")).sendKeys("https://sampleapp.tricentis.com/101/app.php");
// next
	 		driver.findElement(By.id("nextenterproductdata")).click();
		}else {
			System.out.println("false");
		}
		
	//    ENTER PRODUCT DATA6
	//	******************************
		
		Boolean product= driver.findElement(By.xpath("//div[@class='idealsteps-wrap']")).isEnabled();
		if(product==true) {
		System.out.println(product);
		
// calender
		
		String month="December";
		int date1=11;
	 WebElement date3=driver.findElement(By.xpath("(//i[@class='fa fa-calendar-plus-o'])[3]"));
	 date3.click();
WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(12));
while(true) {
	String monthtext=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	if(month.equals(monthtext)) {
		break;
	}else {
		driver.findElement(By.className("ui-datepicker-next")).click();
	}
}
		
driver.findElement(By.xpath("(//a[@class='ui-state-default'])[11]")).click();
 //insurence
		WebElement insurence=driver.findElement(By.id("insurancesum"));
		Select ins=new Select(insurence);
		ins.selectByIndex(3);
// merit rating
		WebElement merit=driver.findElement(By.id("meritrating"));
		Select me=new Select(merit);
		me.selectByVisibleText("Super Bonus");
 // Dmg insurence
		WebElement damageins=driver.findElement(By.id("damageinsurance"));
		Select dmg=new Select(damageins);
		dmg.selectByVisibleText("No Coverage");
//  optional products
		 driver.findElement(By.xpath("(//span[@class=\"ideal-check\"])[6]")).click();
 // courtesy car
		 	WebElement car=driver.findElement(By.id("courtesycar"));
			Select ca=new Select(car);
			ca.selectByVisibleText("No");
// Next
			 driver.findElement(By.id("nextselectpriceoption")).click();
		}else {
			System.out.println("false");
		}
		
	//SELECT PRICE OPTION
//***************************
driver.findElement(By.xpath("(//label[@class=\"choosePrice ideal-radiocheck-label\"])[2]")).click();
     WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement nxt = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='next'])[3]")));
nxt.click();     
	driver.findElement(By.xpath("//input[@id='email']"))	.sendKeys("sowjanya1234@gmail.com");
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8975665432");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sowjanya");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123@Password");
	driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("123@Password");
	driver.findElement(By.xpath("//textarea[@id='Comments']")).sendKeys("Good");
	driver.findElement(By.xpath("//button[@id='sendemail']")).click();

	}
		
		
	}
	
	

	
