package basicweb_automation;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.facebook.com/");
		
	//js.executeScript("document.getElemenById('email').value='sowjanya@gmail.com';");
	js.executeScript("document.getElemenByName('pass').value='9121186474';");

	}

}
