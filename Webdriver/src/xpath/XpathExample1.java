package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("file:///E:/Mahesh/Html/QAPlanet.html");
        
        //fetch the innertext of the 2nd row 2nd col
        
       /* String text = driver.findElement(By.xpath
        		("//html/body/table/tbody/tr[2]/td[2]")).getText(); */
        
      /*  String text = driver.findElement(By.xpath
        		("//table/tbody/tr[2]/td[2]")).getText();  */

      /*  String text = driver.findElement(By.xpath
        		("//table[@id='Table1']/tbody/tr[2]/td[2]")).getText(); */
        
        String text = driver.findElement(By.xpath
        		("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText(); 
        
        
        System.out.println(text);
        driver.close();
	}

}
