package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tooltip {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe"); 
		
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");
         
         WebElement Search = driver.findElement(By.name("q"));
         System.out.println("The tooltip of the Searchbox is ----->" +Search.getAttribute("title"));

         WebElement apps = driver.findElement(By.className("gb_D"));
         System.out.println("The tooltip of the GoogleApps link is ---->" +apps.getAttribute("title"));
         
         WebElement Button = driver.findElement(By.name("btnK"));
         System.out.println("The label on the Search button is ---->" +Button.getAttribute("value"));
         
         driver.close();
	}

}
