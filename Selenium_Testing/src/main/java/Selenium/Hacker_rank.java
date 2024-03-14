package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hacker_rank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String URL ="https://www.hackerrank.com/auth/login";
		driver.get(URL);
		driver.findElement(By.id("input-1")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("7386162996");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='text-link forgot-password-link']")).click();
		driver.findElement(By.id("input-3")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
	}

}
