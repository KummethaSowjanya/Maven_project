package demoqa_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize()	;
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		driver.findElement(By.xpath("//div[@id='tree-node']/div/button[1]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]/svg"));
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span//span[1] ")).click();
		driver.close();
	//  driver.quit();
}
}
