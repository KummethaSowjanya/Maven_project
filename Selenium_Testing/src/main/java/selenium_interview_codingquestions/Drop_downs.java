package selenium_interview_codingquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Selenium.Javascript_executor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_downs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		String Url="https://demo.automationtesting.in/Register.html";
		driver.get(Url);
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBY(0,500)");
		WebElement source=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		source.click();
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
		target.click();
		Select se=new Select(target);
		se.selectByVisibleText("Arabic");
	List<WebElement>skills=driver.findElements(By.cssSelector("#Skills >option"));
		for(WebElement skill:skills) {
			if(skill.getText().equals("Java")) {
			skill.click();
			break;
		}
	}
	
}
}