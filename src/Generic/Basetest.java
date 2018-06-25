package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant{
	public WebDriver driver;
@BeforeMethod
public void openapp()
  {
   driver=new ChromeDriver();
   driver.get(URL);
   }
@AfterMethod
public void closeapp() {
	driver.close();
}
}
