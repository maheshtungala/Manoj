package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CloseAndQuit {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
            "D:\\tet\\chrome\\79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com");
        //driver.close();
        driver.quit();
	}

}
