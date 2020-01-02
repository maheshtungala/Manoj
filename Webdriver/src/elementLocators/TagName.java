package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");

      //ChromeDriver driver = new ChromeDriver();
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");
         
         //fetch all the links from the google homepage
         
         int linkCount = driver.findElements(By.tagName("a")).size();
         
         System.out.println(linkCount);
         
         driver.close();

	}

}
