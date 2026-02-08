package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
By Username=By.xpath("//input[@id='email111']");
By password=By.xpath("//input[@id='password1']");
By submit =By.className("submit-btn");
By singin=By.xpath("//h2[normalize-space()='Sign In']");

public boolean isSignUpPresent()

{
	boolean status=driver.findElement(singin).isDisplayed();
	return status;
}

public DashBoardPage Logintoapplication(String user,String pass)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(Username));
	driver.findElement(Username).sendKeys(user);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(submit).click();
	DashBoardPage dashboard=new DashBoardPage(driver);
	return dashboard;
	
}
}
