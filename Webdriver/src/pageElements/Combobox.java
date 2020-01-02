package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Combobox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select fruits=new Select(driver.findElement(By.id("fruits"))); // combo box.....
		//selecting multiple items from the combo box....
			
		fruits.selectByVisibleText("Banana");//selectByIndex(0).....
		Thread.sleep(3000);
		
		fruits.selectByIndex(1);  //selects apple...
		Thread.sleep(3000);
		//fruits.deselectByVisibleText("Banana");
		String text=fruits.getFirstSelectedOption().getText();
	    System.out.println("The first selected option is :"+ text);
		//deselect the value banana......
		fruits.deselectByVisibleText("Banana"); 
		Thread.sleep(3000);
		driver.close();

	}

}
