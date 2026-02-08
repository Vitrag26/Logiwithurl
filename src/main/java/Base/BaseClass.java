package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class BaseClass {
	public WebDriver driver;
    @BeforeClass
    public void SetUp()
    {
    	ChainTestListener.log("Log INfo-driverclass");
    	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/login");
    	
    }
    @AfterClass
    public void teardown()
    {
    	ChainTestListener.log("Log INfo-teardown");


    	
    	 driver.quit();
    }
}
