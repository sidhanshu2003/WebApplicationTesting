package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserAutomation 
{

	public static void main(String[] args)
	{
		FirefoxDriver HI = new FirefoxDriver();
		
		FirefoxDriver hello = new FirefoxDriver();
		
		hello.get("http://gmail.com");
		 HI.get("http://facebook.com");
		
		HI.navigate().to("http://google.com");
		
		
	}
}
