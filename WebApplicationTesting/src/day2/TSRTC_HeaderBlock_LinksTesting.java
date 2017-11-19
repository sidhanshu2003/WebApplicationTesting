package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_LinksTesting 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		WebElement HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));
		
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderBlockLinks.size());
		
		for(int a=0;a<HeaderBlockLinks.size();a++)
		{
			String HeaderLinkName=HeaderBlockLinks.get(a).getText();
			System.out.println(HeaderLinkName);
			
			HeaderBlockLinks.get(a).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			HeaderBlock=driver.findElement(By.xpath("html/body/div[3]"));			
			HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
		}
		
		driver.close();
		
		
		

	}

}
