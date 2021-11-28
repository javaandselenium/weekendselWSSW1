package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = -1)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test
	public void calls1() {
		Reporter.log("calls1",true);
	}
	
	@Test(priority = 1)
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("chats",true);
	}

}
