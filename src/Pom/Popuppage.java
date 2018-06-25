package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popuppage {
	@FindBy(xpath="(//a[.='Lifestyle'])[2]")
	private WebElement lifestyle;
	@FindBy(xpath="(//ul[@class='sub-header main-menu']//li[@class='parent  kids-6']//div[@class='main-menu-dropdown']//ul//li[@class='child  kids-0']//a[@href='/collections/lunch']")
	private WebElement lunch;
	@FindBy(xpath="//p[@class='h6 name_wrapper'][contains(text(),'Prepd Pack Lunchbox Set')]")
	private WebElement prepd;
	@FindBy(xpath="//span[@class='quantity--increment']")
	private WebElement incre;
	@FindBy(xpath="//span[@id='AddToCartText-product--refresh']")
	private WebElement add;
	@FindBy(xpath="//a[.='No Thanks']")
	private WebElement thank;
	
	  public Popuppage(WebDriver driver)
		 {
		  PageFactory.initElements(driver, this);
		 }
	  public void mylife(WebDriver driver) 
		 {
			 Actions a=new Actions(driver);
			 a.moveToElement(lifestyle).perform();
		 }
	    public void accessories() 
		 {
	    	lunch.click(); 
		 }
	     public void pd() 
		 {
	    	 prepd.click(); 
		 }
	     public void plus() 
		 {
	    	 incre.click(); 
		 }	
	     public void plus2() 
		 {
	    	 incre.click(); 
		 }
	     public void cart() 
		 {
	    	 add.click();
		 }
	     public void popu() 
		 {
	    	 thank.click();
		 }
			 
	}
