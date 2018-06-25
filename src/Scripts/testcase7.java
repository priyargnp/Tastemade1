package Scripts;

import org.testng.annotations.Test;

import Generic.Basepage;
import Pom.Homepage;
import Pom.Loginpage;

public class testcase7 extends Basepage{
@Test
	
    public void login(){
    Loginpage lp=new Loginpage(driver);
    lp.signin();
    lp.facelogin();
    
}
}
