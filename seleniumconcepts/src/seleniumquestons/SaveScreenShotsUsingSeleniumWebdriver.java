package seleniumquestons;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaveScreenShotsUsingSeleniumWebdriver {
	public static void main(String[] args) 
	{
 
 // Open Firefox
	System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

 
// call method
	SaveScreenShotsUsingSeleniumWebdriver.captureScreenShot(driver);
 
// Maximize the window
driver.manage().window().maximize();
SaveScreenShotsUsingSeleniumWebdriver.captureScreenShot(driver);
 
// Pass the url
driver.get("http://learn-automation.com/how-to-capture-screenshot-in-selenium-webdriver/");
SaveScreenShotsUsingSeleniumWebdriver.captureScreenShot(driver);
 
  }
 
public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
     // now copy the  screenshot to desired location using copyFile method
 
      FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));                             
    } 
catch (IOException e)
 
    {
        System.out.println(e.getMessage());
    }
  }
 
 }

/*How to capture Screenshot in Selenium webdriver

For taking  screenshots Selenium has provided TakesScreenShot interface in this interface you can use getScreenshotAs method which will capture the entire screenshot in form of file then using FileUtils we can copy screenshots from one location to another location
Scenario – Open Google  and take screenshot
Let’s implement the same.abstract
If you use above code then it will take screenshot and will store in C:/selenium and screenshot name will be error.png
Now consider a scenario where you have to take multiple screenshots then above code will be repetitive so for this we will create a small method which captures screenshots and will call this method from our script.
So this method we can call from our test case and call multiple time.
Copy the full code and try to execute in Eclipse
package com.bog.htmldemo;
So in above program you can see I called captureScreenshot method three times like this you can create reusable actions in your script and you can use the same.

*/