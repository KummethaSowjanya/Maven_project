package selenium_interview_codingquestions;

import java.awt.Window;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		String Url="https://demo.automationtesting.in/Register.html";
		driver.get(Url);
	
// we are enter firstname
	WebElement firstname=driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
	firstname.sendKeys("kummetha");
	
//we are enter lastname	
	WebElement lastname=driver.findElement(By.cssSelector("input[ng-model=LastName]"));
	lastname.sendKeys("sowjanya");

//we are enter address
	WebElement Address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	Address.sendKeys("kadapa");

//we are enter email
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("sowjanyakummetha56@gmail.com");
	
//we are enter mobile number
	WebElement mobileno=driver.findElement(By.xpath("//input[@type='tel']"));
	mobileno.sendKeys("7386162996");

//we are click the radio buttons
	WebElement radioptions=driver.findElement(By.name("radiooptions"));
	radioptions.click();

//we are click the check box
	WebElement checkbox=driver.findElement(By.id("checkbox1"));
	checkbox.click();
//after then we have click the check box whether it is selected or not
	//if(checkbox.isSelected());
	//checkbox.click();
	
	//scrolling
	JavascriptExecutor js=  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	//language
	WebElement language=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
	language.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	
	WebElement target=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
	target.click();
	Select se=new Select(target);
	se.selectByVisibleText("Arabic");
	//driver.findElement(By.xpath("//div[@class='form-group'][7]")).click();
	Thread.sleep(3000);
	
	//skills
	WebElement skills =driver.findElement(By.xpath("//select[@ng-model='Skill']"));
	Select se1=new Select(skills);
	se1.selectByVisibleText("Art Design");
	}
}
