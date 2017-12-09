package com.Naukri.siteTest.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import com.Naukri.siteTest.Pages.LoginPage;

public class Login {

	public WebDriver driver;

	public Login (WebDriver driver) {
		this.driver = driver;
	}

	public void loginTest () {

		System.out.println ("Logging into Site!!");
		LoginPage login = new LoginPage (driver);
		Properties prop = new Properties ();
		InputStream input = null;

		try {

			input = getClass ().getClassLoader ()
				.getResourceAsStream ("config.properties");
			prop.load (input);
			login.loginSite (prop.getProperty ("UserName"), prop.getProperty ("Password"));
			System.out.println ("Login Successful!!");

		}
		catch (IOException ex) {
			ex.printStackTrace ();
		}
		finally {
			if (input != null) {
				try {
					input.close ();
				}
				catch (IOException e) {
					e.printStackTrace ();
				}
			}
		}

	}
}
