package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");

        //ChromeDriver driver = new ChromeDriver();
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.google.com");
           
           //enter the string "selenium" into the search box
           driver.findElement(By.className("gLFyf")).sendKeys("selenium");

	}

}
