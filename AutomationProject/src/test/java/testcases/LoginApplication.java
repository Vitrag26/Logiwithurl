package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.DashBoardPage;
import pages.LoginPage;


public class LoginApplication extends BaseClass{
	LoginPage login;
	DashBoardPage dashboard;
	@Test
	public void LginWithValiddetails() throws InterruptedException
	{
		
		login=new LoginPage(driver);
	dashboard=	login.Logintoapplication("vitrag26@gmail,com","Jet@2015");
		
	
		//Assert.assertTrue(dashboard.giventext().contains("Learn"),"Learn");
         //this is requried
		dashboard.logoutfromapplication();
		
        Assert.assertTrue(login.isSignUpPresent(),"Logout Failed");
       
		
		
		
	}

}
