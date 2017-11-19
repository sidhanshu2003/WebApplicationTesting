package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This will launch the Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("LogIn to Application");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Compose a Mail");
	}
	
}
