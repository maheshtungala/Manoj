package waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe"); 	
       WebDriver driver=new ChromeDriver();
		
		//explicit Wait........give a wait time of 10 seconds...
       WebDriverWait myWait=new WebDriverWait(driver,10);
		
		//open the application.......
		driver.get("http:apps.qaplanet.in/qahrm");
		
		
		//enter the username and the password...
		//first wait for the username field to be visible...
myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUserName")));
		//enter username into that field..
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		
		//enter password..
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
		//wait until the submit button becomes clickable....
myWait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		
		//click on the submit button...
		driver.findElement(By.name("Submit")).click();
		//click the logout link.....
		myWait.until(ExpectedConditions.titleIs("OrangeHRM"));
		
		//wait until the logout link become clickable....
myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		
		//now click on the logout link....
		driver.findElement(By.linkText("Logout")).click();
			
		driver.close();

	}

}
