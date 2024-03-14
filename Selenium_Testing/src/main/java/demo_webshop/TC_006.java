package demo_webshop;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//click the login button
		driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();
	
//To given valid credentials
	
			driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();

//Search the element name
			WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
			search.sendKeys("Build");
//click on the element name
			driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[1]")).click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window,scrollBy(0,500)");
			

//computer details
			driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click();
			driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_95']")).click();

//quantity  product of computer
			WebElement qua=driver.findElement(By.xpath("//input[@class='qty-input']"));
			qua.clear();
			qua.sendKeys("3");
			//Thread.sleep(3000);

//click on ADD Cart Button
			driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
			Thread.sleep(3000);
			js.executeScript("window,scrollBy(0,-500)");
//click on jewellery
			
			driver.findElement(By.xpath("(//li[@class='inactive']//a)[9]")).click();		
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();	
			
//Jewelry details
			
			WebElement drp= driver.findElement(By.xpath("//select[@id='product_attribute_71_9_15']"));
			Select se=new Select(drp);
			se.selectByVisibleText("Gold (1 mm)");
			driver.findElement(By.xpath("//input[@id='product_attribute_71_10_16']")).sendKeys("20 cm");
			driver.findElement(By.xpath("(//input[@name='product_attribute_71_11_17'])[2]")).click();
		
//quantity product of jewelry
			WebElement qua1=driver.findElement(By.xpath("//input[@class='qty-input']"));
			qua1.clear();
			qua1.sendKeys("3");
			Thread.sleep(3000);
		
//Add to cart 	
			driver.findElement(By.xpath("//input[@id='add-to-cart-button-71']")).click();
			Thread.sleep(3000);
			js.executeScript("window,scrollBy(0,-500)");
		
//click on shopping cart
		driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();

		
//Print the details of jewelry and computer 
		
		String str=driver.findElement(By.xpath("(//div[@class='attributes'])[3]")).getText();
		String str1=driver.findElement(By.xpath("(//div[@class='attributes'])[4]")).getText();

		System.out.println("Computer Details");
		System.out.println("******************");
		System.out.println(str);
		Thread.sleep(3000);
		System.out.println("Jwelry Details");
		System.out.println("******************");
		System.out.println(str1);
		
//click on the edit link
		driver.findElement(By.xpath("(//div[@class='edit-item']/child::a)[1]")).click();
	
// update the details of computer
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_52']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_54']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_57']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_95']")).click();
		
		
//click on update
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		
//click on shopping cart
		
		driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();
				
//print the update details of computer
	String com=	driver.findElement(By.xpath("(//div[@class='attributes'])[3]")).getText();
	System.out.println("Update computer details");
	System.out.println("***********************");
	System.out.println(com);
	//System.err.println(str.equalsIgnoreCase(com));
	
// click on the check boxes 
	driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click();
	driver.findElement(By.xpath("(//input[@name='removefromcart'])[2]")).click();

//click on update shipping cart
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();

		}

}