package demo_webshop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//To click the login button
		driver.findElement(By.xpath("//a[normalize-space()=\"Log in\"]")).click();

//To given valid credentials
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("kummethasowjanya12@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("7386162996");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
	
//Go to the books category and click on the books
		driver.findElement(By.xpath("(//ul[@class='list']//child::a)")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Fiction']")).click();
		WebElement element =driver.findElement(By.xpath("//input[@value='1']"));
		element.clear();
		element.sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();
		
//Go to the shoes category and click on the belt
		
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()=\"Apparel & Shoes\"]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Casual Golf Belt']")).click();
		WebElement element2 =driver.findElement(By.xpath("//input[@class='qty-input']"));
		element2.clear();
		element2.sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-40']")).click();
		
//click on shopping cart
		driver.findElement(By.xpath("//li[@id='topcartlink']//a")).click();
		
//  price and quantity of books
		String price =driver.findElement(By.xpath("(//span[@class='product-unit-price'])[1]")).getText();
		String quantity =driver.findElement(By.xpath("(//input[@value='2'])[1]")).getAttribute("value");

// price and quantity of Shoes

		String price1 =driver.findElement(By.xpath("(//span[@class='product-unit-price'])[2]")).getText();
		String quantity1 =driver.findElement(By.xpath("(//input[@value='2'])[2]")).getAttribute("value");
	

// Convert the extracted values to numeric types
		double priceValue = Double.parseDouble(price);
		int quantityValue = Integer.parseInt(quantity1);
		

// Calculate total cost
		double totalCost = priceValue * quantityValue;

// Print the results

		System.out.println("Price per one book: $" + priceValue);
		System.out.println("Quantity of books: " + quantityValue);
		System.out.println("Total cost: $" + totalCost);
		System.out.println("************************** ");
	
// Convert the extracted values to numeric types
		double priceValue1 = Double.parseDouble(price1);
		int quantityValue1 = Integer.parseInt(quantity1);

// Calculate total cost
		double totalCost1 = priceValue1 * quantityValue1;

// Print the results
		
		System.out.println("Price per one belt: " + priceValue1);
		System.out.println("Quantity of belt: " + quantityValue1);
		System.out.println("Total cost of two belts: " + totalCost1);
		System.out.println(" *********************** ");
	
// adding two products cost	
		double twoproductstotalcost=totalCost + totalCost1;
		System.out.println("Total cost of the books and shoes:"+twoproductstotalcost);
		
//here check the total count price is equal to the subtotal	
		String subtotal= driver.findElement(By.xpath("(//span[@class='product-price'])[1]")).getText();
		float priceValue4 = Float.parseFloat(subtotal);
	
		if(twoproductstotalcost==priceValue4) {
		System.out.println("The totalprice of two products and subtotal price or equal");
		}else {
		System.out.println("The totalprice of two products and subtotal price or notequal");
	}
//To click the check boxes
		driver.findElement(By.xpath("//td[1]/input")).click();

		driver.findElement(By.xpath("(//td[1]/input)[2]")).click();	
	
	}

}
