package com.BrowserAutomatio;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");

	}

}
