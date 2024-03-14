package demo_webshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import demoqa_elements.Alerts;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//click the login button
			driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();
		
//To given valid credentials
		
				driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
				driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
//click on the books
				driver.findElement(By.xpath("(//ul[@class='list']//child::a)")).click();
				driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();

			
	//click on shopping cart
				driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window,scrollBy(0,500)");
				
	
	//Click on the check box
				driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	
	//Click on the checkout
				driver.findElement(By.xpath("//button[@id='checkout']")).click();
				
	boolean bool= driver.findElement(By.id("BillingNewAddress_FirstName")).isDisplayed();
		if(bool==bool) {
			
		}else {
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();	
		}
	//fill the shipping address
				WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
				Select se=new Select(country);
				se.selectByVisibleText("India");
				driver.findElement(By.xpath("(//input[@class='text-box single-line'])[5]")).sendKeys("kadapa");
				driver.findElement(By.xpath("(//input[@class='text-box single-line'])[6]")).sendKeys("kondapuram");
				driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("kondapuram");
				driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("516433");
				driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("3456799999");
				Thread.sleep(2000);
				
				Actions ja = new Actions(driver);
				ja.scrollByAmount(0, 500);
//Click on the continue button
				driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
				
//click on pickup store
			driver.findElement(By.id("PickUpInStore")).click();
			
//Click on the continue button
			driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
//click on payment method//click in cash on delivery
			driver.findElement(By.id("paymentmethod_0")).click();
			
			driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();

//payment information//click on continue button
			driver.findElement(By.xpath("(//input[@type='button'])[6]")).click();


//conform order
			driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
			js.executeScript("window,scrollBy(0,500)");
			
			Thread.sleep(3000);
			
		//click on order details

			driver.findElement(By.xpath("//ul[@class='details']//parent::a")).click();
//order Information
			String order1=driver.findElement(By.xpath("//div[@class='order-number']//strong")).getText();
		
					System.out.println("print the order ID :"+order1);
//click on email		
			driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();
			Thread.sleep(2000);
//click on orders
			driver.findElement(By.xpath("(//a[@class='inactive'])[2]")).click();
			Thread.sleep(3000);
//click on details
			driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
			Thread.sleep(3000);
//order Information
			String order2=driver.findElement(By.xpath("//div[@class='order-number']//strong")).getText();
			String ordernumber=	order2.replace("Order #", "");
				System.out.println("print the order number ID : "+ordernumber);
				System.out.println("****************************");
				if(order1.equals(order2)) {
				System.out.println("The order number is matched main order section number");
					}else {
						System.out.println("The order number is not matched main order section number");
					}
					
				
				
					}
			}


