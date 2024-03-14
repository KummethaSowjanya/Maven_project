package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class html_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			Thread.sleep(3000);
		WebElement CourseElement = driver.findElement(By.id("course"));
		Select Coursedropdown = new Select(CourseElement);
		List<WebElement>dropdownoptions=Coursedropdown.getOptions();
		for(WebElement option :dropdownoptions) {
			System.out.println(option.getText());
			{

			Coursedropdown.selectByIndex(1);
			Thread.sleep(2000);
			Coursedropdown.selectByValue("net");
			Thread.sleep(2000);
			Coursedropdown.selectByVisibleText("Javascript");
			String SelectedText =  Coursedropdown.getFirstSelectedOption().getText();
			//System.out.println(SelectedText);
			
			
			
		}


		}
		}
	}


