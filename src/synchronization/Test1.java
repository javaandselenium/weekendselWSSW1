package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		WebElement ele = driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("gdgdhgdhgafga");
		
	
		
		
		WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		
		
		String title = driver.getTitle();
		wait.until(ExpectedConditions.titleContains("gggfhgh"));
		System.out.println(title);
		
	}

}
