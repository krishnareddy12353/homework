package seleniumquestons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemsFromDropDownSelectBox {
	public static void main(String[] args) throws Throwable {
//http://learn-automation.com/handle-dropdown-in-selenium-webdriver/
//http://www.techbeamers.com/dropdown-and-multiple-select-in-webdriver/
		// Open browser
				System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();

		driver.get("http://spicejet.com/");
           Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		// If you want to accees any methods in class ,create object for that class and access methods

		//using object.method

		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		dropdown.selectByIndex(4);

		dropdown.selectByVisibleText("9 Adults");

		dropdown.selectByValue("8");

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		}

}

		 


