package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");

       //ChromeDriver driver = new ChromeDriver();
          WebDriver driver = new ChromeDriver();
          driver.get("https://www.google.com");
          
          //click the gmail link
          //driver.findElement(By.linkText("Gmail")).click();
          
          //using partialLinkText
          driver.findElement(By.partialLinkText("ma")).click();
          
          System.out.println(driver.getCurrentUrl());

	}

}
