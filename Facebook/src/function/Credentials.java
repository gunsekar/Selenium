package function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Credentials {

	@Test
	public void Home() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Guna\\HP\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
		
		
		
	}

}
