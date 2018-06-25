package Scripts;





import org.testng.annotations.Test;
import Generic.Basepage;
import Generic.Excel;
import Pom.Homepage;
import Pom.Loginpage;


public class testcase1 extends Basepage {
	@Test
	public void log() {
    String s=Excel.Excelsheet(path, "Sheet 1", 3,1);
    String s1=Excel.Excelsheet(path, "Sheet 1", 3, 2);
    String s3=Excel.Excelsheet(path, "Sheet 1", 3, 3);
    

    Loginpage lp=new Loginpage(driver);
    lp.signin();
    lp.username(s);
    lp.password(s1);
    lp.loginbtn();
    Basepage.Title(driver, s3);
   
    Homepage hp=new Homepage(driver);
    hp.profile();
    hp.logout(driver);
    
    
   
    
	}	
}
