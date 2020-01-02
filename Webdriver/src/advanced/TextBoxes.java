package advanced;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
       
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/cssform.html");
		
		List<WebElement> li = driver.findElements(By.tagName("input"));
		
		Iterator itr = li.iterator();
		while(itr.hasNext()){
			WebElement w = (WebElement) itr.next();
			w.sendKeys("hello");
		}

	}

}
