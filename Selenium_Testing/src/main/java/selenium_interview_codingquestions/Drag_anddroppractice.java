package selenium_interview_codingquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_anddroppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		WebElement image1=driver.findElement(By.id("id=\"draggable\""));
		image1.click();
		WebElement trashing=driver.findElement(By.id("droppable"));
		Actions draganddrop=new Actions(driver);
		draganddrop.clickAndHold(image1).moveToElement(trashing).release().build().perform();
		
	}

}
