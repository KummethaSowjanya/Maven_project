package demoqa_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();

			//Radio button
		driver.findElement(By.xpath("//input[@value='radio1']")).click();

			//Text box
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("INDIA");
			//dropdown Example
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")));
		dropdown.selectByVisibleText("Option2");			//dropdown Example

			//Check box example
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
			//open window
	//Set<String> abc=driver.findElement(By.id("openwindow").
		driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//a[normalize-space()=\"About us\"]")).click();
		
		driver.switchTo().window("driver");
		//Thread.sleep(3000);
	
			//open Tab
		driver.findElement(By.id("opentab")).click();
		
		driver.findElement(By.name("enter-name")).sendKeys("Sowjanya");
		
		//driver.findElement(By.id("alertbtn")).click();
		//.sleep(3000);
		//driver.findElement(By.id("confirmbtn")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");
		//WebElement table=driver.findElement(By.xpath("//table[@id='product']//tbody//td[normalize-space()=\"Selenium Webdriver with Java Basics + Advanced + Interview Guide\"]"));
		
	}

}
