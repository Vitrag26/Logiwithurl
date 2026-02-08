package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.chaintest.plugins.ChainTestListener;

import Base.BaseClass;
import pages.DashBoardPage;
import pages.LoginPage;


public class LoginApplication extends BaseClass{
	LoginPage login;
	DashBoardPage dashboard;
	@Test
	public void LginWithValiddetails()
	{
		
		login=new LoginPage(driver);
	dashboard=	login.Logintoapplication("vitrag26@gmail,com","Jet@2015");
		
	
	ChainTestListener.log("Log INfo-User is login");
		//Assert.assertTrue(dashboard.giventext().contains("Learn"),"Learn");
         //this is requried
		dashboard.logoutfromapplication();
		
        Assert.assertTrue(login.isSignUpPresent(),"Logout Failed");
       
		
		
		
	}

}
