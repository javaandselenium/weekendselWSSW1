package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = -1)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(invocationCount = 3)
	public void status() {
		Reporter.log("status",true);
	}
	
	@Test(priority = 1,enabled=false)
	public void settings() {
		Reporter.log("settings",true);
	}

}
