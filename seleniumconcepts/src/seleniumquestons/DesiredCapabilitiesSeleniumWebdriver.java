package seleniumquestons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesSeleniumWebdriver {
	 public static void main(String[] args) {

		//it is used to define IE capability 
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


		System.setProperty("webdriver.ie.driver", "E:\\drivers\\IEDriverServer.exe");
		  
		 //it is used to initialize the IE driver
		 WebDriver driver = new InternetExplorerDriver(capabilities);
		  
		 driver.manage().window().maximize();

		 driver.get("http://gmail.com");
		  
		 driver.quit();
		 }
		  
		
}	
	
	
	
/*
 * getBrowserName()
public java.lang.String getBrowserName()
setBrowserName()
public void setBrowserName(java.lang.String browserName)
getVersion()
public java.lang.String getVersion()
setVersion()
public void setVersion(java.lang.String version)
getPlatform()
public Platform getPlatform()
setPlatform()
public Platform getPlatform()
getCapability Method
The getCapability method of the Desired Capabilities class can be used to get the capability that is in use currently in the system.

public java.lang.Object getCapability(java.lang.String capabilityName)
setCapabilityMethod
The setCapability() method of the Desired Capabilities class can be used to set the device name, platform version, platform name, absolute path of the app under test (the .apk file of the app(Android) under test), app Activity (in Android) and appPackage(java).

"setCapability method" in java has the below declarations:

setCapability : public void setCapability(java.lang.String capabilityName,boolean value)
setCapability  :public void setCapability(java.lang.String capabilityName,java.lang.String value)
setCapability  :public void setCapability(java.lang.String capabilityName,Platform value)
setCapability  :public void setCapability(java.lang.String key,java.lang.Object value)
 * 
 * 
 * 
 * 
 */

