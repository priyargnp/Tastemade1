package Scripts;

import org.testng.annotations.Test;

import Generic.Basepage;
import Pom.Homepage;



public class testcase6 extends Basepage{

	@Test
		// TODO Auto-generated method stub
		public void login(){
		   
		    Homepage hp=new Homepage(driver);
		    hp.cracc();
		    hp.emailid("priyargnp@gmail.com");
		    hp.passcode("navaneetha1@");
		    hp.newlink();
		//  hp.profile();
	    //  hp.logout(driver);
	}

}
