package com.BrouserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CaputingTitle_And_Url_Facebook
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
