package demoqa_elements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Windows.html"); 
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		//System.out.println(driver.getTitle());
		Set<String>	s=driver.getWindowHandles();		//set is java predifined class ,it contains many values
														//here all values are string type
		for(String i:s) {							//i is contain id of the browser
		//System.out.println(i);					//two window unique ids are print
		String t=driver.switchTo().window(i).getTitle();     //get title get store the t variable
		System.out.println(t);
		//if(t.contains("Selinium")) {
			
		}
		//driver.close();
	}

}

