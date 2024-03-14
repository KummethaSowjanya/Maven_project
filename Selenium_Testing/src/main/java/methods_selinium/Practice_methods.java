package methods_selinium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");  	//get method();
			driver.manage().window().maximize();
			List<WebElement> links=driver.findElements(By.id("firstName"));
				for(WebElement linksadd:links) {
					linksadd.sendKeys("sowjanya");
					driver.findElements(By.id("lastName"));
					linksadd.sendKeys("kummetha");
					String value=linksadd.getText();
					System.out.println(value);

	}

}
}