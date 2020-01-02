package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com");
	   
	   driver.findElement(By.name("email")).sendKeys("maheshtungala");
	}

}
