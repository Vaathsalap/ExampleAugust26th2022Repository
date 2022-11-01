package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromepractice {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		logout();
		
		
		

	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("Admin");
			oBrowser.findElement(By.name("password")).sendKeys("admin123");
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
