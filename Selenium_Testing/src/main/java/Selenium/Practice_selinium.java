package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_selinium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/");
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS );
	//driver.findElement(By.xpath("//a[@aria-label='India']")).click();
		   
		    Set<String> allWH = driver.getWindowHandles();
		    int count=allWH.size();
		    System.out.println(count);
		    for(String wh :allWH)
		    {
		      driver.switchTo().window(wh);
		      String title=driver.getTitle();
		      System.out.println(title);
		      driver.close();
	}
	}
}

