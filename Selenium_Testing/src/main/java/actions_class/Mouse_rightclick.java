package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		WebElement button=	driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		//context click method
		act.contextClick(button).build().perform();	//Right click on the element
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();//click the copy action
		
		System.out.println(driver.switchTo().alert().getText());//capture the text from alert box
		driver.switchTo().alert().accept();
		
		
	}

}
