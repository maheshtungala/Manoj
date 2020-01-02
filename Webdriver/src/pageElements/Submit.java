package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe"); 
		
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");
         
         WebElement Search = driver.findElement(By.name("q"));
         Search.sendKeys("selenium");
         
         Search.submit();
         //click the search button
         //driver.findElement(By.name("btnK")).click();

         driver.navigate().back();
         Search.sendKeys("selenium");
         Search.submit();
	}

}
