package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemFromDropDownInSelenium {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		selectItemFromDropDown();
		 showItemFromDropDown();
		 selectItemFromDropDownBasedOnPartialitemName();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
		    oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		    oBrowser.navigate().to("E:\\HTML\\Sample.html");
		    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void selectItemFromDropDown()
	{
		try
		{
			WebElement oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
			oSelect.selectByIndex(3);
		    Thread.sleep(2000);
		    oSelect.selectByValue("sel");
		    Thread.sleep(2000);
		    oSelect.selectByVisibleText("Selenium RemoteControl");
		    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void showItemFromDropDown()
	{
		try
		{
			WebElement oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
		List <WebElement> oLists=oSelect.getOptions();
		for(int i=0;i<oLists.size();i++)
		{
			WebElement list=oLists.get(i);
			String content=list.getText();
			System.out.println(content);
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void selectItemFromDropDownBasedOnPartialitemName()
	{
		try
		{
			WebElement oList=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oList);
		List <WebElement> oLists=oSelect.getOptions();
		for(int i=0;i<oLists.size();i++)
		{
			WebElement list=oLists.get(i);
			String content=list.getText();
			if(content.endsWith("IDE"))
			{
				oSelect.selectByVisibleText(content);
			}
			
		 }
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
