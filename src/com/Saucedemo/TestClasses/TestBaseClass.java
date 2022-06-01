package com.Saucedemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass 
{
	System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
   driver.manage().window().maximize();
   
	
   driver.get("https://www.saucedemo.com/");
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   

}
