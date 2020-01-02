package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm");

		WebElement UN = driver.findElement(By.name("txtUserName"));
		
		if(UN.isDisplayed()){
			System.out.println("The username field is displayed");
		}else{
			System.out.println("The username field is not displayed!");
		}
		//enter some text into the username field
		UN.sendKeys("wlerj2309");
		
		Thread.sleep(3000);
		//clear the text field
		UN.clear();
		
		Thread.sleep(3000);
		//enter the correct username
		UN.sendKeys("qaplanet1");

	}

}
