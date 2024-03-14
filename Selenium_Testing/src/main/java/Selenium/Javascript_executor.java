package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
//		driver.get("https://demoqa.com/");
//		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(" document.getElementById('email').value='sowjanya'");
		js.executeScript("document.getElementsByName('pass')[0].value='syuid'" );
//		js.executeScript("document.getElementsByName('login')[0].click()");
//		js.executeScript("document.getElementsByName('firstname')[0]");
//				//Highlight WebElements
//		
//		border
		js.executeScript(" document.getElementById('email').style.border='blue dotted'");
//		background
		js.executeScript(" document.getElementById('email').style.background=' yellow '");
//		border+background
		js.executeScript(" document.getElementByI('email').setAttribute('style','border: 'red solid';background:'yellow'");

		js.executeScript(" document.getElementById('pass').style.border='pink dotted'");
//		background
		js.executeScript(" document.getElementById('pass').style.background=' dark blue '");
//		border+background
		js.executeScript(" document.getElementByI('pass').setAttribute('style','border: 'red solid';background:'yellow'");
		
		
		
		
		
		
		
		
		//Scroll operations
		js.executeScript("window.scrollTo(0,500)");
		//Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");

	}

}
