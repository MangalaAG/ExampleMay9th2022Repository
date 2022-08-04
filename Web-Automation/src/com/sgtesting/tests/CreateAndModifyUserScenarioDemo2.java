package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndModifyUserScenarioDemo2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);	
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
		 oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		 Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void createUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("firstName")).sendKeys("demo");
	    oBrowser.findElement(By.name("lastName")).sendKeys("User1");
	    oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
	   oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
	    oBrowser.findElement(By.name("password")).sendKeys("welcome@123");
	    oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome@123");
	    Thread.sleep(2000);
	    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
	    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("firstName")).clear();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("firstName")).sendKeys("new_demo");
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("password")).clear();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("password")).sendKeys("welcome_new@123");
	    
	    oBrowser.findElement(By.name("passwordCopy")).clear();
	    Thread.sleep(2000);
	    oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome_new@123");
	    Thread.sleep(2000);
	    oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
	    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	   private static void logout()
	    {
	    	
	    	try 
	    	{
	    		oBrowser.findElement(By.linkText("Logout")).click();
	        	Thread.sleep(2000);
	    	    
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	  private static void deleteUser()
	    {
	    	try 
	    	{
	    		oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
	    		Thread.sleep(1000);
	    		Alert oAlert=oBrowser.switchTo().alert();
	    		String content=oAlert.getText();

	    		System.out.println(content);

	    		oAlert.accept();
	    		Thread.sleep(1000);

	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
	    }
	  private static void closeApplication()
		{
			try
			{
				oBrowser.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
