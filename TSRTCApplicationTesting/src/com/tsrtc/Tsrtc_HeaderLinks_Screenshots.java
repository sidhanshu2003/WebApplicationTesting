package com.tsrtc;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Tsrtc_HeaderLinks_Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		//System.setProperty("webdriver.Edge.driver", arg1);
		
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJarFiles\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		//InternetExplorerDriver
		//EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.tsrtconline.in/oprs-web/");
		/*System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();*/
		WebElement headerblock = driver.findElement(By.xpath("html/body/div[3]/div"));
		//WebElement headerblock = driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerlinks = headerblock.findElements(By.tagName("a"));
	
	System.out.println("Total No of Links Found in headerblock "+headerlinks.size());
	for(int i = 0;i<headerlinks.size();i++)
	{
		if(headerlinks.get(i).isDisplayed())
		{
			String linkName=headerlinks.get(i).getText();
			System.out.println(linkName); 
			
			headerlinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			Thread.sleep(3000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Sys\\Desktop\\WeekEndScreenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			 headerblock = driver.findElement(By.xpath("html/body/div[3]/div"));
			//headerblock = driver.findElement(By.className("menu-wrap"));
			headerlinks = headerblock.findElements(By.tagName("a"));
			
		}
		
	}
	driver.close();

	
	}
}


