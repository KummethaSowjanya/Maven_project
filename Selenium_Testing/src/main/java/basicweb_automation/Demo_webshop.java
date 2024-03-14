package basicweb_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_webshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/cart");
	WebElement element=	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a"));
	element.click();
	
	
	
	
}
}