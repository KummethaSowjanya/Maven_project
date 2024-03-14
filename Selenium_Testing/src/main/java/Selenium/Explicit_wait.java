package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_wait {

	public static void main(String[] args) {
		      WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver1i,10,500);
		//wait.withTimeout(Duration.ofMillis(3000));
		
				
				driver1.get("https://blog.testproject.io/");
				driver1.findElement(By.linkText("Login")).click();
				//driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("sowji@24");
//				WebDriverWait wait = new WebDriverWait(driver,10,500);
				//driver1.findElement(By.name("commit")).click();
				
				
				
			}
	}


