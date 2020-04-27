package com.newMT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
   WebDriver driver;

  By username=By.name("userName");
  By password=By.name("password");
  By loginbutton=By.name("login");
  
  public Login(WebDriver driver)
  {
	  this.driver=driver;
  }
  //1st method
  /*public void mtusername()
  {
	  driver.findElement(username).sendKeys("manjusha1");
  }

  public void mtpassword()
  {
	  driver.findElement(password).sendKeys("manjusha");
  }
  public void mtlogin()
  {
	  driver.findElement(loginbutton).click();
  }*/
  
  //2nd method
  public void mtusername(String uid)
  {
	  driver.findElement(username).sendKeys(uid);
  }

  public void mtpassword(String pass)
  {
	  driver.findElement(password).sendKeys(pass);
  }
  public void mtlogin()
  {
	  driver.findElement(loginbutton).click();
  }
}
