package demoqa_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@id='app']//h5[normalize-space()=\"Elements\"]")).click();
		
		//click method();
		WebElement driver1=	driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
		driver1.click();	
		
		//get attribute method();
		String value = driver1.getAttribute("id");
		System.out.println("attribute value is:"+value);
		
		//get tag name();
		String tagname=driver1.getTagName();
		System.out.println("Tag name:"+tagname);	
		
		//get text method();
		driver.findElement(By.id("userName")).sendKeys("Kummetha sowjanya");
		driver1.getText();
		System.out.println(driver1);
		
		//sendkeys method();
		driver.findElement(By.id("userEmail")).sendKeys("sowjanyakummetha34@gmail.com");
		
		//clear method();
		WebElement driver2=driver.findElement(By.cssSelector("#currentAddress"));
		driver2.sendKeys("Hyderabad");
		driver2.clear();
		Thread.sleep(3000);
		driver2.sendKeys("Andhra pradesh");
		
						//By using Point class we could get the web elements x y coordinates in Selenium WebDriver.
	
		//Thread.sleep(3000);
		WebElement driver3= driver.findElement(By.id("permanentAddress"));
				driver3.sendKeys("Anatapur");	
				Point location=driver3.getLocation();
				System.out.println(location.getY());
	
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		
	}

}
