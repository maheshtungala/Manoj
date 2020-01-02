package advanced;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe");    
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		List<WebElement> li = driver.findElements(By.name("country"));
		
		Iterator itr=li.iterator();
		while(itr.hasNext()){
			WebElement w =(WebElement) itr.next();
			System.out.println(w.getText());
		}
        driver.close();
	}

}
