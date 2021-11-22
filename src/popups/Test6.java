package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		String expTitle="ICICI";
		
		for(String allpopup:child) {
			driver.switchTo().window(allpopup);
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			if(actTitle.equals(expTitle)) {
				driver.close();
			}
		}
	}

}
