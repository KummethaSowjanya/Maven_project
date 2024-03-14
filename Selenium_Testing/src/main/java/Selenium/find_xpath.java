package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class find_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

//AI
driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='AI']")).click();

//TECH
driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='Tech']")).click();
//PROGRAMMING
driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='Programming']")).click();
// Selinium
driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='Selenium'")).click();
// 


	}

}
