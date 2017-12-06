package com.Naukri.siteTest.Test;

import org.testng.annotations.Test;
import com.Naukri.siteTest.Pages.LoginPage;
import com.Naukri.siteTest.Pages.ProfilePage;
import com.Naukri.siteTest.Pages.Setup;

public class CvUpdate extends Setup{

	@Test
	public void updateCV () {
		String usrName = "faisal.khatri@ymail.com";
		String pass = "Hotmail@1";
		String filePath = "E:\\Dropbox\\Dropbox\\Resume\\Latest_CV.docx";
		
		
		System.out.println ("Test Begins!!");
		
		LoginPage login = new LoginPage (driver);
		login.loginSite (usrName, pass);

		System.out.println ("Login Successful, now Updating CV....");
		
		ProfilePage pg = new ProfilePage(driver);
		pg.UpdateCV (filePath);
		
		
		System.out.println ("Latest CV Uploaded to Naukri.com!!");
	}
	
}
