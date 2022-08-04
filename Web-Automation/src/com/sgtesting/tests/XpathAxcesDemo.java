package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxcesDemo {
	  public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchbrowser();
		navigate();
		//absoluteXPath();
		//xpathcase1();
		//xpathcase2();
		//xpathcase3();
		//xpathcase4();
		//xpathcase5();
	}
	private static void lanchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser =new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:///E:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("UserDemo1");
	}

private static void xpathcase1()
{
	//By using Tagname
	oBrowser.findElement(By.xpath("//input")).sendKeys("UserDemo1");
}
private static void xpathcase2()
{
	//By using Tagname and index
	oBrowser.findElement(By.xpath("//input[2]")).sendKeys("UserDemo1");
}
private static void xpathcase3()
{
	//By using Tagname with attribute name and value
	oBrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("UserDemo1");
}
private static void xpathcase4()
{
	//By using Tagname with attribute name and value
	oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
}
private static void xpathcase5()
{
	//By using Tagname with attribute name and value
	oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
}
private static void xpathcase6()
{
	//By using Tagname with attribute name and value
	oBrowser.findElement(By.xpath("//input[@name='submit1btn1'][@value='Submit']")).click();
}
}
