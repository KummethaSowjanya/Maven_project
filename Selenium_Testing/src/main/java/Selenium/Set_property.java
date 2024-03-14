package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver. chrome.driver","C:\\Users\\RS-EMP\\Downloads");
	WebDriver driver=new ChromeDriver();
	driver.get("https://testsigma.com/blog/setproperty-in-selenium/");
	
	driver.findElement(By.id(""));
	driver.close();
	driver.quit();
}
}
