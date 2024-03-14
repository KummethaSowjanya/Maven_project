package basicweb_automation;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class If_condition {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		

		// TODO Auto-generated method stub
		// Click on the "Apparel & Shoes" link
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']")).click();

		// Create an object to generate random numbers
		Random ran1 = new Random();

		// Find all elements matching the specified XPath for "Add to cart" buttons
		List<WebElement> shoesList = driver.findElements(By.xpath("//input[@value='Add to cart']"));

		// Get the number of products
		int numberOfProducts = shoesList.size();

		// Use an if-else statement to decide whether to click on "Apparel & Shoes" or a random button
		if (ran1.nextBoolean()) {
		    // Generate a random index
		    int randomIndex = ran1.nextInt(numberOfProducts);

		    // Click on the randomly selected "Add to cart" button
		    shoesList.get(randomIndex).click();
		} else {
		    // Click on the "Apparel & Shoes" link
		    driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']")).click();
		}

	}

}
