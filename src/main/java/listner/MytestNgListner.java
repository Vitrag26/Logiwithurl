package listner;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class MytestNgListner implements ITestListener {
	
	  public void onTestSuccess(ITestResult result) {
		  
		  ChainTestListener.log("Log:Pass -Test Passed"+result.getMethod().getMethodName());
		    // not implemented
		  }
	  public  void onTestFailure(ITestResult result) {
		    ChainTestListener.log("Fail : Fail-Test Fail"+result.getMethod().getMethodName()+""+result.getThrowable().getMessage());
		  }
	  
	  public  void onTestSkipped(ITestResult result) {
		   ChainTestListener.log("Skip : Skip-Test Fail"+result.getMethod().getMethodName());
		  }

}
