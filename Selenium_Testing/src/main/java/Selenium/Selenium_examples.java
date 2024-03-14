package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/log/s?k=log+in");
		//driver.findElement(By.xpath("//div[@id='nav-main']//i]")).click();
		driver.findElement(By.xpath("/a[@title='WOMEN']")).click();
	}
	
	//*[@id="hmenu-content"]/ul[1]/li[7]/a    //  //div[@id='hmenu-content']//a[@data-menu-id="5"]
}
