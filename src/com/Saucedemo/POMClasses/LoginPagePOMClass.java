package com.Saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	private WebDriver driver;
	private Actions act;
	@FindBy(xpath="//input[@id='user-name']")
			private WebElement username;
	
	public void SendUserName()
	{
		username.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	
	private WebElement password;
    public void SendPassword()
    {
    password.sendKeys("secret_sauce");
    }
    @FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
    public void ClickLogInButton()
    {
     login.click();
    }
  //constructor declare
	
  	public LoginPagePOMClass(WebDriver driver)
  	{
  		  //global  = local
  		this.driver = driver;
  		
  		//selenium class
  		PageFactory.initElements(driver, this);
  		
  		 act = new Actions(driver);
  		
  	}


}
