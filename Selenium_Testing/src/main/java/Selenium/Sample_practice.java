package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Sample_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//open URL
driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
driver.manage().window().maximize();
//Enter Firstname
driver.findElement(By.name("firstname")).sendKeys("Sowjanya");//textbox
//Set lastname
driver.findElement(By.name("lastname")).sendKeys("Kummetha");
//select gender
driver.findElement(By.id("sex-1")).click();//radio button
driver.findElement(By.xpath("//input[@id=\"exp-0\"]")).click();//radiobutton
driver.findElement(By.id("datepicker")).sendKeys("29/11/2023");
driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();//Automation testing ( check box)
//driver.findElement(By.name("tool")).click(); //Automation tool(check box)
//Select dropdown = new Select(driver.findElement(By.name("continents")));
//dropdown.selectByVisibleText("Australia");
//Select dropdown1 = new Select(driver.findElement(By.id("selenium_commands")));
//dropdown1.deselectByValue("Browsercommands");
//driver.navigate ().forward();


	}
}
