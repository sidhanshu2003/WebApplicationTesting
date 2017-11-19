package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
	public void BrowserLaunch_And_OpenApplication()
	{
		System.out.println("Opening Firefox Browser and Open Gmail Application");
	}
	
	@Test(priority=1)
	public void LogIn()
	{
		System.out.println("LogIn to Application");
	}
	
	@Test(priority=2)
	public void SentMail()
	{
		System.out.println("Sent Mail Functionality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Closing the Application");
	}
	
	
}
