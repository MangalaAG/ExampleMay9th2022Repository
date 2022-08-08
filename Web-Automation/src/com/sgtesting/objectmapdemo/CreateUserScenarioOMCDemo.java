package com.sgtesting.objectmapdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenarioOMCDemo {
	//public static String filename=null;
	public static WebDriver oBrowser=null;
	public static ObjectMap objmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		//logout();
		//closeApp();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objmap=new ObjectMap(".\\ObjectMap\\objectmap.properties");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}private static void login()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
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
		oBrowser.findElement(objmap.getLocator("userpageuserbtn")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(objmap.getLocator("createuserlink")).click();
	    Thread.sleep(2000);
	    oBrowser.findElement(objmap.getLocator("userfirstname")).sendKeys("Mangala");
	    oBrowser.findElement(objmap.getLocator("userlastname")).sendKeys("AG");
	    oBrowser.findElement(objmap.getLocator("useremail")).sendKeys("MangalaAG@gmail.com");
	    oBrowser.findElement(objmap.getLocator("createusername")).sendKeys("MangalaAG");
	    oBrowser.findElement(objmap.getLocator("createpassword")).sendKeys("welcome@123");
	    oBrowser.findElement(objmap.getLocator("crearepasswcopy")).sendKeys("welcome@123");
	    Thread.sleep(2000);
	    oBrowser.findElement(objmap.getLocator("createuserbutton")).click();
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
	    		oBrowser.findElement(objmap.getLocator("selectuser")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(objmap.getLocator("deleteuser")).click();
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
		private static void logout()
		{
			try
			{
				oBrowser.findElement(objmap.getLocator("homepagelogoutlnk")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		private static void closeApp()
		{
			try
			{
				oBrowser.quit();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
}
