package function;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Login {

@Test
public void Home() throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Guna\\Testing\\Selenium\\Files\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    
		    Select dropdown=new Select( driver.findElement(By.id("searchDropdownBox")));
		    dropdown.selectByVisibleText("Books");
		    
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		   
		   TakesScreenshot screenshot=(TakesScreenshot) driver;
		   File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		   File destinationfile=new File("C:\\Users\\gunaa\\OneDrive\\Desktop\\sample.png");
		   
		   org.openqa.selenium.io.FileHandler.copy(sourcefile, destinationfile);
		   
		   System.out.println("Screeshot taken");
		   
		   
		     
		    
		    
		    
		    System.out.println("Screenshot Taken");
		    }

}
