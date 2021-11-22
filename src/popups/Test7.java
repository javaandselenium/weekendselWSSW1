package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test7 {

	public static void main(String[] args) {

		//chrome browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		//firefoxBrowser
	    FirefoxOptions options1=new FirefoxOptions();
		options1.addArguments("--disable-notifications");
		WebDriver driver1 = new FirefoxDriver(options1);
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get("https://nmk.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
