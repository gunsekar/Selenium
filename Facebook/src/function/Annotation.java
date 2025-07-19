package function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotation {

	@Test
	public void Testcase1()
	{
		System.out.println("Test case 1");
	}

	@Test
	public void Testcase2() {
		
		System.out.println("Test case 7");
	}
	
	public void Beforesuite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Guna\\Testing\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
		
	    System.out.println("Before suite");
	}
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Guna\\Testing\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	    System.out.println("Youtube");
		
	}
	public void BeforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Guna\\Testing\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.linkedin.com/feed/");
	    driver.manage().window().maximize();
	}
	 
	public void Beforeclass()
	
	{
		
	System.out.println("Beforeclass");	
	}
	
	public void Aftermethod() {
		
		System.out.println("After method");
	}
	
	public void Afterclass () {
		
		System.out.println("After class");
	}
	public 
}
