package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
			WebElement name	= driver.findElement(By.name("firstname"));
				name.sendKeys("sowjanya");
				driver.findElement(By.name("lastname")).sendKeys("Kummetha");
				driver.findElement(By.name("reg_email__")).sendKeys("9121879935");
//				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kummethasowjanya12@gmail.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("sowji@");
				Select dropdown = new Select(driver.findElement(By.name("birthday_day")));
				dropdown.selectByIndex(22);
				Select dropdown1 = new Select(driver.findElement(By.name("birthday_month")));
				dropdown1.selectByValue("3");
				Select dropdown2 = new Select(driver.findElement(By.name("birthday_year")));
				dropdown2.selectByVisibleText("2002");
				driver.findElement(By.name("sex")).click();
				driver.findElement(By.xpath("//*[@id=\"reg_form_box\"]/div[11]")).click();
		
	}

	}


