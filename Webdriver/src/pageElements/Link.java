package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
        
		WebElement Gmail= driver.findElement(By.linkText("Gmail"));
        
		//check if the link is enabled or not..
		
		if(Gmail.isEnabled()){
			System.out.println("The gmail link is enabled");
			Gmail.click();
			System.out.println(driver.getCurrentUrl());
		}else{
			System.out.println("The gmail link is not enabled!");
			driver.close();
		}

	}

}
