package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdrop_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.id("box3"));
		WebElement target=driver.findElement(By.id("box103"));
		//Actions class
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		//WebElement Oslo=driver.findElement(By.id("box1"));
		//WebElement spain=driver.findElement(By.id("box107"));
		//act.clickAndHold(Oslo).moveToElement(spain).release().build().perform();
	

}
}