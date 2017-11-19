package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours 
{

	//WebElement register=driver.findElement(by.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	
	public void FindAFlight(String u, String p)
	{
		UserName.sendKeys(u);
		password.sendKeys(p);
		SignIn.click();
	}
}
