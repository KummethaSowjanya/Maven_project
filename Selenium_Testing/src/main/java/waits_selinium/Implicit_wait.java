package waits_selinium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selinium Webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);//Return is used to press the enter key
		driver.findElement(By.xpath("//h3[normalize-space()=\"WebDriver\"]")).click();

	}

}
