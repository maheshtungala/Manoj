package advanced;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        File obj = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(obj, new File("E:\\mahesh.jpg"));
        driver.close();
	}

}
