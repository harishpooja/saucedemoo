package com.Saucedemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Saucedemo.POMClasses.LoginPagePOMClass;

public class TC01LogInFunctionality 
{
	@Test
	public static void LogInFunctionalityTest() 
	{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
       
    	
       driver.get("https://www.saucedemo.com/");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       LoginPagePOMClass lp= new LoginPagePOMClass(driver);
       
       lp.SendUserName();
       lp.SendPassword();
       lp.ClickLogInButton();
       
       String expectedTitle = "Swag Labs";
       String actualTitle = driver.getTitle();
       
       System.out.println("Verify the test case");

       
      if(expectedTitle.equals(actualTitle))
      {
   	   System.out.println("Test case is passed");
      }
      else
      {
   	   System.out.println("Test case is failed");
      }
          
      
       //logout
      driver.quit();
      System.out.println("End of program");

       
       
       
		
	}

}
