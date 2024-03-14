package demoqa_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id=\"item-2\"]/span[normalize-space()=\"Radio Button\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]")).click();
	}

}
