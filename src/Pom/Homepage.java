package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.Basepage;

public class Homepage extends Basepage{
	@FindBy(xpath="//span[.='Profile']")
	private WebElement profilebtn;
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signout;
	@FindBy(xpath="//span[.='Travel']")
	private WebElement Travel;
	@FindBy(xpath="//span[.='Home']")
	private WebElement home;
    @FindBy(xpath="//span[.='Shop']")
	private WebElement shop;
	@FindBy(xpath="//h2[.='Flavor Trail in Mexico']")
	private WebElement trav;
	@FindBy(xpath="//h2[.='Body']")
	private WebElement hm;
	@FindBy(xpath="(//p[@class='h6 name_wrapper'])[1]")
	private WebElement im;
	@FindBy(xpath="//span[.='Create Account']")
	private WebElement createacc;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pin;
	@FindBy(xpath="//span[.='Create Account']")
	private WebElement newclick;
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement tocart;
	@FindBy(xpath="(//input[@class='search-bar aa-input'])[1]")
	private WebElement sear;
	
	
	
	
     public Homepage(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
     public void profile() 
	 {
		 profilebtn.click();
	 }
	
	 public void travelMenu() 
	 {
		Travel.click();
	 }
	 public void HomeMenu() 
	 {
		home.click();
	 }
	 public void shopMenu() 
	 {
		shop.click();
	 }
	 
	 public void Trav() 
	 {
		trav.click();
	 }
	 public void Home() 
	 {
		hm.click();
	 }
	 public void Item() 
	 {
		im.click();
	 }
	 public void cracc() 
	 {
		createacc.click();
	 }
	 public void emailid(String u) 
	 {
		email.sendKeys(u);
	 }
	 public void passcode(String v) 
	 {
		pin.sendKeys(v);
	 }
	 public void newlink() 
	 {
		newclick.click();
	 }
	 public void take() 
	 {
		 tocart.click();
	 }
	 public void search(String find) 
	 {
		 sear.sendKeys(find);
	 }
	 
	 
	 
 public void logout(WebDriver driver) 
	 {
		 Actions a=new Actions(driver);
		 profilebtn.click();
		 a.moveToElement(signout).click().perform();
	 }
	 
}
