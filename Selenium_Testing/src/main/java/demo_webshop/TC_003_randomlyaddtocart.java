package demo_webshop;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class TC_003_randomlyaddtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//To click the login button
				driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();
				
//To given valid credentials
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();

//click on the books and add  book to the cart randomly
		
		 driver.findElement(By.xpath("(//ul[@class='list']//child::a)")).click();
	
		 Random ran= new Random();
		 List<WebElement> bookslist = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 int numberOfProducts = bookslist.size();
		 System.out.println("no.of products :"+  numberOfProducts);
		 int randomIndex = ran.nextInt(numberOfProducts);
		 bookslist.get(randomIndex).click();
		 
//click on the Apparel shoes and add shoes to the cart randomly
		 driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()=\"Apparel & Shoes\"]")).click();
		 
		 Random ran1=new Random();
		 List<WebElement> shoeslist=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 int noofprodcts= shoeslist.size();
		
		 System.out.println("no.of products :"+  noofprodcts);
		 int ranindex=ran1.nextInt(noofprodcts);
		 shoeslist.get(ranindex).click();
		 
//click on the digital downloads and add music to the cart randomly
		 
		 driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()=\"Digital downloads\"]")).click();
		 Random ran2=new Random();
		 List<WebElement> downloadlist=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 int products=downloadlist.size();
		 System.out.println("no.of products :"+products);
		 int index=ran2.nextInt(products);
		 downloadlist.get(index).click();
		 
//click the shopping cart
			driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();

//To  click the check boxes 
			driver.findElement(By.xpath("//td[1]/input")).click();
			driver.findElement(By.xpath("(//td[1]/input)[2]")).click();
			driver.findElement(By.xpath(("(//td[1]/input)[3]"))).click();
			Thread.sleep(3000);	
//Click the update shopping cart
		
			driver.findElement(By.name("updatecart")).click();
			
//logout the mail
			
			 driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
			Thread.sleep(3000);	
			
//close the browser
			driver.close();
			driver.quit();
}
}


