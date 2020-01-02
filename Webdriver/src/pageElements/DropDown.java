package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe");    
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
		//create an object for the dropdown.. 
		Select drpCountry=new Select(driver.findElement
				                        (By.xpath("//select[@size='1']")));
		
		Thread.sleep(3000);
		
		//drpCountry.selectByVisibleText("ANTARCTICA");
		//drpCountry.selectByIndex(6);
		drpCountry.selectByValue("234");
		Thread.sleep(3000);
		//drpCountry.deselectByVisibleText("ANTARCTICA");
	
		//drpCountry.selectByVisibleText("ANGOLA");
		//drpCountry.selectByIndex(4);
		drpCountry.selectByValue("251");
		Thread.sleep(3000);
		driver.close();

	}

}
