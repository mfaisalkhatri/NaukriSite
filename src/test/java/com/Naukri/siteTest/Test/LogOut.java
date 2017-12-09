package com.Naukri.siteTest.Test;

import org.openqa.selenium.WebDriver;
import com.Naukri.siteTest.Pages.LogOutPage;

public class LogOut {

	public WebDriver driver;

	public LogOut (WebDriver driver) {
		this.driver = driver;
	}

	public void logOutSite () {
		System.out.println ("Logging Out!");
		LogOutPage logout = new LogOutPage (driver);
		logout.logOutSite ();
		System.out.println ("Logged out successfully!!");
	}

}
