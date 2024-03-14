package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_overactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/");
		//Actions class
		Actions act=new Actions(driver);
		
		WebElement AI =driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='AI']"));
		WebElement Tech= driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='Tech']"));
		WebElement programming=driver.findElement(By.xpath("//div[@class='overflowable-contents']//a[normalize-space()='Programming']")); 
		
		//moveToElement();
		
		act.moveToElement(AI).build().perform();	//mouseover action
		//act.moveToElement(programming).build().perform();
	}

}
