package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\tet\\chrome\\79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("file:///E:/Mahesh/Html/Checkbox.html");
		
		WebElement cb = driver.findElement(By.name("vehicle1"));

		for(int i=1;i<3;i++){
			cb.click();
			System.out.println(cb.isSelected());
			Thread.sleep(3000);
	}

}
}