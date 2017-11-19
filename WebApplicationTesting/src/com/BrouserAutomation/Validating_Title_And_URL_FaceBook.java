package com.BrouserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title_And_URL_FaceBook
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedTitle = "Facebook – log in or sign up";
		
		String ActualTitle= driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- FAIL");
		}
		
		String ExpectedUrl="facebook.com";
		
		String ActualUrl= driver.getCurrentUrl();
		
		if(ActualUrl.contains(ExpectedUrl))
		{
			System.out.println("URL Matched _ PASS");
		}
		else
		{
			System.out.println("URL Not Matched  -- FAIL");
		}
		
		driver.close();

	}

}
