package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingAlert
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("KARIMNAGAR");
		
		//alt.dismiss();
		
	//	alt.sendKeys("Hello");
		
		

	}

}
