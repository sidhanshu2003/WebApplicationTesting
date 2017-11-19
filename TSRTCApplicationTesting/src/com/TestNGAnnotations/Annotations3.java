package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeMethod
	public void OpenApplication_And_LogIn()
	{
		System.out.println("Open Gmail and LogIN");
	}
	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("Compse Mail Functionality");
	}
	
	@Test(priority=2)
	public void SentMail()
	{
		System.out.println("Sent Mail Functionality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Closing the Application");
	}
	
	
}
