package waits_selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,300)");
		
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		driver.findElement(By.id("btn1")).click();
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"txt1\"]")));
		driver.findElement(By.xpath("//*[@id=\"txt1\"]")).sendKeys("hyr");
		driver.close();
	}

}
