package com.newt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginNew
{
	WebDriver driver;

	public  LoginNew(WebDriver driver)
			{
		     this.driver=driver;
			}
	
	
   //Basic
     @FindBy(name="userName") WebElement username;
     
     //Dynamic
     @FindBy(how=How.NAME,using="password")
     @CacheLookup
     WebElement password;
     
     
     @FindBy(how=How.NAME,using="login") 
     @CacheLookup
     WebElement loginbutton;
     
     
     public void logincheck(String uid,String pid)
     {
    	 username.sendKeys(uid);
    	 password.sendKeys(pid);
    	 loginbutton.click();
     }
}
