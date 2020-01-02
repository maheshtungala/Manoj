package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		//navigate to the google homepage
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		//click the gmail link
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(3000);
		//navigate back to google homepage
		driver.navigate().back();
		
		Thread.sleep(3000);
		//navigate forward 
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//reload the current page
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//print the current url..
		System.out.println(driver.getCurrentUrl());
		
	}

}
