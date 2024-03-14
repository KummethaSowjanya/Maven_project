package basicweb_automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Adding_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
			WebElement entertext=	driver.findElement(By.id("twotabsearchtextbox"));
			entertext.sendKeys("Redmi 12 5G");
			
			driver.findElement(By.id("nav-search-submit-button")).submit();
			WebElement element=driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
			element.click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,500)");
		
			Set<String> s=driver.getWindowHandles();
			ArrayList ar=new ArrayList(s);
			System.out.println(ar.get(0));
			System.out.println(ar.get(1));
			driver.switchTo().window((String)ar.get(1));
		driver.findElement(By.id("add-to-cart-button")).click();
	//	driver.findElement(By.xpath("//input[@type=\"submit\"][1]")).click();
		
	}

}
