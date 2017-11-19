package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursLogInTest 
{

	@Parameters("Browser")
	
	@Test
	public void LogInTest(String BrowserName) throws IOException
	{
		
		System.out.println(BrowserName);
		
		DesiredCapabilities cap=null;
		
		if(BrowserName.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(BrowserName.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.126.134:4444/wd/hub"),cap);
		
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sys\\Desktop\\WeekEndBatch\\WebApplicationTesting\\NewToursApplicaion,properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Pwd"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		driver.close();
		
	}
	
	
	
}
