package com.newt.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newt.pages.LoginNew;

public class MTLogin
{
    @Test
	public void LogincheckMT()
	{
    	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//LoginNew log=new LoginNew(driver);
		
		LoginNew log=PageFactory.initElements(driver, LoginNew.class);
		log.logincheck("cjc1", "pass");
		
		
	}
}
