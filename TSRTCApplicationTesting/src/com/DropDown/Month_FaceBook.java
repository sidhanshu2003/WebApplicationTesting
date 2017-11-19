package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Month_FaceBook
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		WebElement Month=driver.findElement(By.id("month"));
		List<WebElement>MonthNames=Month.findElements(By.tagName("option"));
		
		for(int i=1;i<MonthNames.size();i++)
		{
			String MonthName=MonthNames.get(i).getText();
			System.out.println(MonthName);
		}

		driver.close();
	}

}
