package selenium_interview_codingquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		WebElement selectoption=driver.findElement(By.xpath("/div[@class='dropdown-active-item product-category-active']"));
		selectoption.click();
		
	List<WebElement> producttypes=driver.findElements(By.xpath("//li[@data-target='Non Housing Loans']"));
	System.out.println(producttypes.size());
	for(WebElement type:producttypes) {
		if(type.getText().equals("Non housing loans")) {
			type.click();
			break;
		}
	}
		
		
		
		
		
	}

}
