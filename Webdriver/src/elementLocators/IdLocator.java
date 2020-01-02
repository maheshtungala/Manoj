package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public abstract class IdLocator {
   public static void main(String[] args){
	   System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.facebook.com");
	   
	   driver.findElement(By.id("email")).sendKeys("maheshtungala");
	   
   }
}
