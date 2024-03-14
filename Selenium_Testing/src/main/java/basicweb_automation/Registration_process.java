package basicweb_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//
		
		//driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Sowjanya");
		//Here we are given invalid user name
		driver.findElement(By.id("//input[@placeholder=\\\"First Name\\\"]")).sendKeys("sowjanya933878@");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("kummetha");
		driver.findElement(By.xpath("//textarea[@rows=\"3\"]")).sendKeys("Anatapur,kadapa");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("sowjanya@12gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7386162996");
		
}
}
