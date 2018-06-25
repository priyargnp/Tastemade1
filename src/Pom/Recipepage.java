package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recipepage {
	@FindBy(xpath="//a[.='Skillet Recipes']")
	private WebElement skills;
	@FindBy(xpath="//span[.='Food']")
	private WebElement food;
	@FindBy(xpath="//h2[.='Skillet White Chicken Chili Dip']")
	private WebElement mexi;
	
	
	public Recipepage(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	public void foodmenu() 
	 {
		food.click();
	 }
	
	public void skill() 
	 {
		skills.click();
	 }
	public void fmenu() 
	 {
		mexi.click();
	 }
	
	
}
