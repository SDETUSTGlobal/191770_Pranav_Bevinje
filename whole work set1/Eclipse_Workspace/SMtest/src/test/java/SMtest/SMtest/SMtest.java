package SMtest.SMtest;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
import cucumber.annotation.en.Given;  
import cucumber.annotation.en.Then;  
import cucumber.annotation.en.When;    
public class SMtest 
{
WebDriver driver= null;
 @Given("^user login page$")  
 public void goToWebLogin()
 {
	 System.setProperty("webdriver.chrome.driver","D://Eclipse//chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");  
 }  
   
 @When("^I enter valid data on the page$")  
 public void enterData()
 {
	 driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
	 driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
	 driver.findElement(By.id("ctl00_MainContent_orderLInk")).click();
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
	 driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
	 driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();
 }
 @Then("^User login should be successful$")  
 public void User_login_should_be_successful() 
 { 
	 if(driver.getTitle().equalsIgnoreCase("Web Orders"))
	 {  
		 System.out.println("Test Pass");  
	 } 
	 else 
	 {  
		 System.out.println("Test Failed");  
	 }  
	 driver.close();  
 }
}

