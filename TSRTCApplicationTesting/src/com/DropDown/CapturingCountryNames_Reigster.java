package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCountryNames_Reigster 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
		
		System.out.println(CountryNames.size());
		
		for(int i=0;i<CountryNames.size();i++)
		{
			String CountryName=CountryNames.get(i).getText();
			System.out.println(CountryName);
		}

		driver.close();
	}

}
