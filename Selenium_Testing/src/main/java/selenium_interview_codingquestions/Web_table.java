package selenium_interview_codingquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/tables"); 
	 int rows=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr")).size();
	 System.out.println(rows);
	 
	 int col=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th")).size();
	 System.out.println(col);
	 for(int i=2;i<=rows;i++) {
	
		for(int j=1;j<=col;j++) {
			driver.findElement(By.xpath("//table/tbody/tr[2]/th[1]")).getText();
		}
}
}
}