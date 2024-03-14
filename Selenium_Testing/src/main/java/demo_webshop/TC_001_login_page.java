package demo_webshop;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_login_page {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demowebshop.tricentis.com/");
		//System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
//To click the login button
		driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();
		
//We are given invalid email,, valid password
		
		driver.findElement(By.id("Email")).sendKeys("kummthanyagmail.com");
		driver.findElement(By.id("Password")).sendKeys("7386162996");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		System.out.println	(driver.findElement(By.xpath("//span[text()=\"Please enter a valid email address.\"][1]")).getText());
	
			
//we are taking the screenshot of error message of the invalid email
		
		WebElement section=driver.findElement(By.xpath("//div[@class=\"returning-wrapper\"]"));
		File src=section.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\screen shot\\hgb.png"));
		System.out.println(" The screenshot is successfully invalid email");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
//We are given valid email and invalid password
		
		driver.findElement(By.id("Email")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selinium");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]")).getText());
	  	Thread.sleep(3000);
		
//we have to clear the email and password
	  	
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		
		
		Thread.sleep(3000);
		
//valid user name and valid password
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
			Thread.sleep(3000);
		
			
//screenshot the successfull login page
			
		WebElement section1=driver.findElement(By.xpath("//div[@class=\"master-wrapper-content\"]"));
		File trg=section1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(trg, new File("C:\\screen shot\\jhg.jpg"));
		System.out.println("The screenshot is successful valid credentials");
		
//logout the page
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
//next closing the entire browser
		driver.close();
		driver.quit();
		
		
		
		
		
		
	}
}
