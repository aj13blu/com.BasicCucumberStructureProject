package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Steps 
{
	public WebDriver driver;
	
	@Given("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajinkya.bhobad\\Desktop\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
    	driver.get("https://webmail.ixiasolutions.com/");
    	Thread.sleep(3000);
	   
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='rcmloginuser']")).sendKeys("ajinkya.bhobad@ixiasolutions.com");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='rcmloginpwd']")).sendKeys("Ixia@12345");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='rcmloginsubmit']")).click();   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   driver.close();
	}
}
