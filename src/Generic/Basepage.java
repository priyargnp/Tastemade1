package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage extends Basetest{

public void elementPresent(WebElement element)
{
 try {
  WebDriverWait w=new WebDriverWait(driver,10);
  w.until(ExpectedConditions.visibilityOf(element));
  Reporter.log("element is found");
}
 catch(Exception e)
 {
	 Reporter.log("element is not found",true); 
	 Assert.fail();
 }
}
 public static void Title(WebDriver driver,String actual)
 {
	 
		String title=driver.getTitle();
		Assert.assertEquals(actual, title );
  }
 
 public void verifytitle(String title)
 {
	 try {	 
	 WebDriverWait w=new WebDriverWait(driver,10);
	  w.until(ExpectedConditions.titleIs(title));
	  Reporter.log("title is pass",true);
 }
 
     catch(Exception e)
 {
	 Reporter.log("title fail",true); 
	 Assert.fail();
 }
 
 
}
}

