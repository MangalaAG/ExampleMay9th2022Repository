package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserPOM {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApp();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
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
			oPage.getGettingStartedShortcutsPanelId().click();
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
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getoAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("demo");
			oPage.getLastName().sendKeys("User1");
			oPage.getEmail().sendKeys("demo@gmail.com");
			oPage.getUsername().sendKeys("demouser1");
			oPage.getPassword().sendKeys("welcome123");
			oPage.getPasswordCopy().sendKeys("welcome123");
			Thread.sleep(4000);
			oPage.getoCreateUser().click();
			Thread.sleep(4000);		
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void deleteUser()
	{
		try 
		{
			oPage.getoUserLink().click();
			Thread.sleep(3000);
			oPage.getUserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
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
			oPage.getoLogout().click();
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
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
