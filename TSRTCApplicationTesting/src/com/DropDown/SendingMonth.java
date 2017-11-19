package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendingMonth 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		WebElement Month=driver.findElement(By.id("month"));
		Month.sendKeys("Dec");
		
		driver.close();

	}

}
