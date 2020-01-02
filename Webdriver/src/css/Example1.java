package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/cssform.html");
		
		//login
		driver.findElement(By.cssSelector("input.required")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[class=passfield]")).sendKeys("hello");
		
		
		driver.findElement(By.cssSelector("input:nth-child(3)")).click();
		

	}

}
