package com.newt.testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.newMT.pages.Login;

public class MTLogin
{
   @Test
	public void verifylogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		Login l= new Login(driver);
		
		/*l.mtusername();
		l.mtpassword();
		l.mtlogin();*/
		
		l.mtusername("manjusha1");
		l.mtpassword("manjusha");
		l.mtlogin();
	}
}
