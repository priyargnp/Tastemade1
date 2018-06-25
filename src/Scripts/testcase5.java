package Scripts;

import org.testng.annotations.Test;

import Generic.Basepage;
import Generic.Excel;
import Pom.Homepage;
import Pom.Loginpage;
import Pom.Popuppage;


public class testcase5 extends Basepage{
 @Test
 public void login(){
	 String t=Excel.Excelsheet(path, "Sheet 1", 3, 1);
	 String t1=Excel.Excelsheet(path, "Sheet 1", 3, 2);
	 String t3=Excel.Excelsheet(path, "Sheet 1", 3, 3);
	 Loginpage lp=new Loginpage(driver);
	 lp.signin();
	 lp.username(t);
	 lp.password(t1);
	 lp.loginbtn();
	 Basepage.Title(driver, t3);
			    
 Homepage hp=new Homepage(driver);
 hp.shopMenu();


 Popuppage p=new Popuppage(driver);
 p.mylife(driver);
 p.accessories();
 p.pd();
 p.plus();
 p.plus2();
 p.cart();
 p.popu();
 
 

	}

}
