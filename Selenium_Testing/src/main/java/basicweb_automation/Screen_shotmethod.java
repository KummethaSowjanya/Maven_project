package basicweb_automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_shotmethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement section=driver.findElement(By.xpath("//div[@class='returning-wrapper']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		//File trg=new File("C:\\Users\\RS-EMP\\Pictures\\Screenshots\\One.jpg");
		
		FileUtils.copyFile(src, new File("C:\\Users\\RS-EMP\\Pictures\\Screenshots\\fgb.jpg"));
		System.out.println("screen shot successfully");
		//driver.quit();
	}

}
