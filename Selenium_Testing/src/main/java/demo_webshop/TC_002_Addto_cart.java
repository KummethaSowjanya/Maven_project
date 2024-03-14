package demo_webshop;



import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_Addto_cart {

	public static void main(String[] args) 	throws InterruptedException, IOException {
	// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		//click the login button
			driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();
		
		//To given valid credentials
		
				driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
				driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
				
		//click the books
				
				driver.findElement(By.xpath("(//ul[@class='list']//child::a)")).click();
				driver.findElement(By.xpath("(//div[@class='item-box']//input[@type='button'])[2]")).click();
				
		//click the belt
				
				driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()=\"Apparel & Shoes\"]")).click();
				driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();
				//driver.findElement(By.xpath("//input[@type='button'])[6")).click();
			
		//click the digital downloads
				driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()=\"Digital downloads\"]")).click();
				driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
				
				Thread.sleep(3000);
		//click the shopping cart
			driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();
				
		//To click the check boxes
			driver.findElement(By.xpath("//td[1]/input")).click();
	
			driver.findElement(By.xpath("(//td[1]/input)[2]")).click();
	
			driver.findElement(By.xpath(("(//td[1]/input)[3]"))).click();
			
		Thread.sleep(3000);
			
		//Click the update shopping cart
		
			driver.findElement(By.name("updatecart")).click();
			
			
		//logout the mail
			
		 driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			
		 //Browser close
		 driver.close();
		 driver.quit();
			
			
	}
	
	}
	


