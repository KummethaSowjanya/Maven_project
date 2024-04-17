package Demo_webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_008 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");


//To click the login button
		driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();

//To given valid credentials
 
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();

// Scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window,scrollBy(0,1000)");

		
//click on the search box	
		driver.findElement(By.xpath("(//div[@class=\"column customer-service\"]//a)[1]")).click();
			
//search the categeory in search box
		driver.findElement(By.xpath("//input[@id='Q']")).sendKeys("Jewelry");
	
//click on Advance search		
		driver.findElement(By.xpath("//input[@id='As']")).click();

// click on search button	
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

		
// enter the jewelry catageory	
		
	WebElement jewlry=	driver.findElement(By.xpath("(//select[@data-val='true'])[1]"));
		Select se =new Select(jewlry);
		se.selectByVisibleText("Jewelry");
		
		
// click on search sub categories		
		driver.findElement(By.xpath("//input[@id='Isc']")).click();
		
// Enter the price range
		driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys("high");
	
		driver.findElement(By.xpath("//input[@class='price-to']")).sendKeys("low");

// click on  the product descriptions
		driver.findElement(By.xpath("//input[@id='Sid']")).click();

		
// click on the search box
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

// Scroll down the page
		js.executeScript("window,scrollBy(0,500)");

// click on add to cart button
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	
		Thread.sleep(3000);
// Scroll up the page
		js.executeScript("window,scrollBy(0,-500)");
	
		
		Thread.sleep(3000);
// click on shopping cart
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		
		Thread.sleep(3000);
// click on check box		
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
// click on update shipping cart
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	}

}
