package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Savedpage {
	@FindBy(xpath="//div[@class='VideoSaveButton']")
	private WebElement save;
	@FindBy(xpath="//span[.='My Saved Videos']")
	private WebElement mysaved;
	@FindBy(xpath="//span[.='Profile']")
	private WebElement profilebtn;
	
	public Savedpage(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	
	 public void mysavedvideo(WebDriver driver) 
	 {
		 Actions a=new Actions(driver);
		 a.moveToElement(profilebtn).perform();
		 mysaved.click();
     }
	
}
