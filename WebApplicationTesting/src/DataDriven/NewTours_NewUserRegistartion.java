package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistartion 
{

FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void NewUserRegistartion()
	{
		driver.findElement(By.name("firstName")).sendKeys("Uma");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("7777777");
		driver.findElement(By.id("userName")).sendKeys("Umai@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Begumpet");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("50001");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.id("email")).sendKeys("Ummmmaaaa");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedName = "Ummmmaaaa";
		
		String ActualUserName=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(ActualUserName.contains(ExpectedName))
		{
			System.out.println("User registerd with the same UserName -- PASS");
		}
		else
		{
			System.out.println("Registered username not matched -- FAIL");
		}
		
				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
