package Pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.Basepage;

public class Loginpage extends Basepage{
	
 @FindBy(xpath="//span[.='Sign In']")
 private WebElement signinbtn;	
 @FindBy(xpath="//input[@id='EMAIL']")
 private WebElement usn;
 
 @FindBy(xpath="//input[@id='PASSWORD']")
 private WebElement pwd;
 
 @FindBy(xpath="//button[@class='Button-kDSBcD jDVmgl']")
 private WebElement lbtn;
 @FindBy(xpath="//a[@class='Button-kDSBcD ljQpYs']")
 private WebElement fblgn;
 
 public Loginpage(WebDriver driver)
 {
  PageFactory.initElements(driver, this);
 }


 public void signin() 
 {
	 signinbtn.click(); 
 }
 public void username(String us) 
 {
	 usn.sendKeys(us);
 }
 
 public void password(String pass) 
 {
	 pwd.sendKeys(pass);
 }
 
 public void loginbtn() 
 {
	 lbtn.click();;
 }
 public void facelogin() 
 {
	 fblgn.click();;
 }
 
 
}
