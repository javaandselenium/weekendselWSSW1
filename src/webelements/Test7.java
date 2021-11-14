package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("username"));
		if(ele.isDisplayed()) {
			System.out.println("Pass:element is element is dispalyed");
		 ele.sendKeys("admin");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
        if(login.isEnabled()) {
        	System.out.println("Pass:element is enabled");
        }
        else
        {
        	System.out.println("Fail:element is not enabled");
        }
        
        WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
        if(checkbox.isSelected()) {
        	System.out.println("Pass:element is selected");
        }
        else
        {
        	System.out.println("Fail:element is not selected");
        }
	
        
        driver.close();
	}

}
