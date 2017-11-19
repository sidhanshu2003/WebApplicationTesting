package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformClick_Register_Vacations_BackToHome
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		// driver.findElementByLinkText("REGISTER").click();
		
		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		//Register.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.linkText("Vacations")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		driver.close();

	}

}
