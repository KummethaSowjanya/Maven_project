package selenium_interview_codingquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Select dropbtn1=new Select(driver.findElement(By.cssSelector("#course")));
		//dropbtn1.selectByVisibleText("Dot Net");
		List<WebElement> alloptions=dropbtn1.getOptions();
		for(WebElement options:alloptions) {
			if(options.getText().equals("java"));
			options.click();
			break;
		}
	}

}




//https://seleniumbase.io/demo_page