package MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart_Electronics__Samsung_Click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");

		//Sleeper.sleepTightInSeconds(5);
		Thread.sleep(5000);
		
		WebElement Electronics= driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
