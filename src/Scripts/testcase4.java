package Scripts;

import org.testng.annotations.Test;

import Generic.Basepage;
import Generic.Excel;
import Pom.Homepage;
import Pom.Loginpage;


public class testcase4 extends Basepage{
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
		    hp.HomeMenu();
		    hp.Home();
		   
   }
}