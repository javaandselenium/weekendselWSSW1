package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@class='play-icon']")).click();
	
	}

}
