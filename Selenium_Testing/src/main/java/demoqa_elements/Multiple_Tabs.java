package demoqa_elements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("opentab")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("APjFqb")).sendKeys("selinium webdriver");
		driver.findElement(By.id("APjFqb")).submit();
		driver.findElement(By.xpath("//h3[normalize-space()=\"WebDriver\"]")).click();
		
		
		
	}

}
