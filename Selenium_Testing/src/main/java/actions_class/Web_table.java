package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//open the UTRL
        driver.get("https://www.nseindia.com/market-data/top-gainers-loosers?cat=G");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  
        //identify the webTable
        WebElement table = driver.findElement(By.tagName("table"));
  
        // To find the third row of a table
        WebElement Rowtable = table.findElement(By.xpath("//table[@id='topgainer-Table']/tbody/tr[3g]"));
        String rowtext = Rowtable.getText();
        System.out.println("The row text of the web table : " + rowtext);
  
        // To get third row and fourth Column
        WebElement cellNo = Rowtable.findElement(By.xpath("//table[@id='topgainer-Table']/tbody/tr[3]/td[4]"));
        String valueNo = cellNo.getText();
        System.out.println("Cell value is : " + valueNo);
        
                
}
}