package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_practice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
driver.findElement(By.id("alertButton")).click();
Thread.sleep(3000);
//driver.switchTo().alert().accept();
System.out.println(driver.getCurrentUrl());

//driver.findElement(By.id("timerAlertButton")).click();
//driver.switchTo().alert().dismiss();
//driver.findElement(By.id("promtButton")).click();
//driver.switchTo().alert().accept();
	}

}
