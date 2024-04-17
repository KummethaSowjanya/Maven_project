package Demo_webshop;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_007 {

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
//click on computers
driver.findElement(By.xpath("(//li[@class='inactive']/child::a)[2]")).click();
//click on Notebooks
driver.findElement(By.xpath("(//h2[@class='title']/a)[2]")).click();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window,scrollBy(0,500)");

//click on click on computer image
driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();

//click on Add to compare list first product
driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();

//print the first product name		
String str=	driver.findElement(By.xpath("//td/a")).getText();
System.out.println("product name:"+str);

//print the first product price
String str1=	driver.findElement(By.xpath("(//tr[@class='product-price'])/td[2]")).getText();
System.out.println("price of the of the Laptop: "+str1);


//////Navigate the another Url
driver.navigate().to("https://demo.nopcommerce.com/computers");

//click on the Notebooks
driver.findElement(By.xpath("(//li[@class='inactive']/child::a)[2]")).click();

//Randomly select one product in notebooks

Random ran =new Random();
List<WebElement> books= driver.findElements(By.xpath("//div[@class='picture']"));
int listofproducts=books.size();
int index =ran.nextInt(listofproducts);
books.get(index).click();

js.executeScript("window,scrollBy(0,500)");

//click on Add to compare list second product
driver.findElement(By.xpath("//div[@class='compare-products']")).click();

js.executeScript("window,scrollBy(0,2500)");
Thread.sleep(3000);

driver.findElement(By.xpath("(//ul[@class='list']/child::li)[11]")).click();
Thread.sleep(3000);

System.out.println("**********************************");
String str2=driver.findElement(By.xpath("//tr[@class='product-name']//child::a")).getText();
System.out.println("second product name:"+str2);


String str3=driver.findElement(By.xpath("//tr[@class='product-price']//child::td[2]")).getText();
System.out.println("price of the of the second product: "+str3);


System.out.println(str1.equalsIgnoreCase(str3));
	}

}
