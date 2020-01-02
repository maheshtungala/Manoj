package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBox1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
            "D:\\tet\\chrome\\79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm");

		//enter some text into the username field
		driver.findElement(By.name("txtUserName")).sendKeys("wlerj2309");
		
		Thread.sleep(3000);
		//clear the text field
		driver.findElement(By.name("txtUserName")).clear();
		
		Thread.sleep(3000);
		//enter the correct username
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	}

}
