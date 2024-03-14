package actions_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		String Url="https://demo.automationtesting.in/Register.html";
		driver.get(Url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window,scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("window,scrollBy(0,-500)");

	}

}
