package seleniumquestons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyApplicationLoginPageIsWorkingOrNot {
	 public static void main(String[] args) {
         
		 // Open Firefox
			System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

	         //Open gmail
	         driver.get("http://www.gmail.com");
	          
	         // Enter userd id
	         WebElement element = driver.findElement(By.id("Email"));
	         element.sendKeys("12353");
	          
	         //wait 5 secs for  userid to be entered
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	          
	         //Enter Password
	         WebElement element1 = driver.findElement(By.id("Passwd"));
	         element1.sendKeys("Password");
	          
	         //Submit button
	         element.submit();
	          
	          
	         WebElement myDynamicElement = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("gbg4")));
	         driver.findElement(By.id("gbg4")).click();
	          
	         //press signout button
	 driver.findElement(By.id("gb_71")).click();   
	          
	          
	    }
	     
	     
	 
	}

