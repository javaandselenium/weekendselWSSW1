package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//it is used to eneter the url and wait till page is loaded
	driver.get("https://www.amazon.com/");
	
	//to get the title of the page
	System.out.println(driver.getTitle());
	
	//to get the url of the aplication
	System.out.println(driver.getCurrentUrl());
	
	//to close the application
	driver.close();
	

	}

}
