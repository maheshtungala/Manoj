package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
public class Example1 {
	WebDriver driver;
@BeforeTest
public void openBrowser(){
	System.setProperty("webdriver.chrome.driver",
			"D:\\tet\\chrome\\79\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qahrm");
}
@BeforeClass
public void welcomeMessage(){
	System.out.println("Executing the First Test Case");
}
@BeforeMethod
public void login() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
}
@Test(priority=0)
 public void verifyLogin(){
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	Reporter.log("VerifyLogin TestCase Passed");
}
@Test(priority=1)
 public void addEmp() throws InterruptedException{
	String firstName ="Mahesh";
	String lastName  ="Tungala";

	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
	                             
	//add the employee details.....
	Thread.sleep(5000);
	driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
	driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	
	//Thread.sleep(2000);
	
	//verify the employee name just entered .....in the personal details page...
	
	Thread.sleep(5000);
	//driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
	//Thread.sleep(2000);
	String fN=driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).getAttribute("value");
	String lN=driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).getAttribute("value");
	System.out.println("firstName :"+ fN);
	System.out.println("lastName : "+ lN);
	
	Assert.assertTrue((fN.equals(firstName)&&(lN.equals(lastName))));
	Reporter.log("Add Emp TestCase Passed");
	driver.switchTo().parentFrame();
}
@Test
 public void editEmp(){
	Assert.assertEquals(11, 12);
}
@AfterMethod
public void logout(){
	driver.findElement(By.linkText("Logout")).click();
}
@AfterClass
public void farewellMessage(){
	System.out.println("First TestCase completed!");
}
@AfterTest
public void closeBrowser(){
	driver.close();
}
}
