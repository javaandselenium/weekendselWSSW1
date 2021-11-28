package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void tc1() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("trrtytrytrytr");
		driver.findElement(By.id("pass")).sendKeys("ryggyuyuryuyu");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		
		//Assert.assertEquals(title,"uyerytrytry");
		SoftAssert a=new SoftAssert();
		a.assertEquals(title,"Facebook – log in or sign up");
		
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		a.assertAll();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	

}
