package com.Naukri.siteTest.Test;


import java.io.IOException;
import org.testng.annotations.Test;
import com.Naukri.siteTest.Pages.Setup;

public class Test1 extends Setup{
	
	@Test
	public void updateCV () throws IOException {

		Login login = new Login (driver);
		login.loginTest ();
		
		ProfileUpdate pf = new ProfileUpdate(driver);
		pf.UpdateCV ();
		
		LogOut logg = new LogOut (driver);
		logg.logOutSite ();

	}

}
 