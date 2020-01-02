package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       driver.get("http://apps.qaplanet.in/qahrm");
       driver.findElement(By.name("Submit")).click();
       
       Alert al=driver.switchTo().alert();

       //fetch the innertext
       String message = al.getText();
       
       System.out.println("The message on the alert is " +message);
       
       al.accept();  //clicks the ok button
       
       System.out.println(driver.getCurrentUrl());
	}

}
