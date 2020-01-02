package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC1_VerifyTitle {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	             "D:\\tet\\chrome\\79\\chromedriver.exe");

             //ChromeDriver driver = new ChromeDriver();
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.google.com");
                
           /*   String expTitle = "Google";
                String actTitle = driver.getTitle();
                
                //compare the titles
                if(actTitle.equals(expTitle)){  */
                
                if(driver.getTitle().equals("Google")){
                	System.out.println("Titles matching, TC Passed!");
                }else{
                	System.out.println("Titles not matching, TC Failed!");
                }
                
                driver.close();
}
}
