package selenium_interview_codingquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_site {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/92248/retry"); 
		WebElement dtd = driver.findElement(By.xpath("(//tbody/tr//td[contains(text(),'John')])[1]"));
		String str = dtd.getText();
		System.out.println(str);
	}

}
