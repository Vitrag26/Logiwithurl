package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
		By menu=By.xpath("//img[@alt='menu']");
		By Logout=By.xpath("//button[normalize-space()='Sign out']");
		By welcomemessage=By.xpath("//h3");
		
		public String giventext()
		{
		String msg=driver.findElement(welcomemessage).getText();
		System.out.println("msg"+msg);
		return "message";
		}
		public void logoutfromapplication()
		{
			driver.findElement(menu).click();
			driver.findElement(Logout).click();
		}
		
		
	}


