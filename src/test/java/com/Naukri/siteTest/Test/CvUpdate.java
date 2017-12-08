package com.Naukri.siteTest.Test;

import org.testng.annotations.Test;

import com.Naukri.siteTest.Pages.LogOutPage;
import com.Naukri.siteTest.Pages.LoginPage;
import com.Naukri.siteTest.Pages.ProfilePage;
import com.Naukri.siteTest.Pages.Setup;

public class CvUpdate extends Setup{

	@Test
	public void updateCV () {
		String usrName = "faisal.khatri@ymail.com"; //Enter your email id/username here..
		String pass = "Hotmail@1"; // Enter your password here..
		String filePath = "G:\\Dropbox\\Dropbox\\Resume\\Latest_CV.docx"; // Enter the path of your latest Cv. 
		
		
		System.out.println ("Test Begins!!");
		
		LoginPage login = new LoginPage (driver);
		login.loginSite (usrName, pass);

		System.out.println ("Login Successful, now Updating CV....");
		
		ProfilePage pg = new ProfilePage(driver);
		pg.UpdateCV (filePath);
		
		System.out.println ("Latest CV Uploaded to Naukri.com!! Now Logging Out!");
		
		LogOutPage logout = new LogOutPage (driver);
		logout.logOutSite ();
		
		System.out.println ("Logged out successfully!!");
	}
	
}
