package demoqa_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.web_driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver  =new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions button=new Actions(driver);
		WebElement doubleclickbutton=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		WebElement clickbutton=	driver.findElement(By.xpath("//button[@id='o6Yj2']"));
		button.doubleClick(doubleclickbutton).build().perform();
		button.contextClick(rightclick).build().perform();
		clickbutton.click();
		
		
		
	}

}
