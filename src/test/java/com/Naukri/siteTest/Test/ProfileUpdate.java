package com.Naukri.siteTest.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.Naukri.siteTest.Pages.ProfilePage;

public class ProfileUpdate {

	public WebDriver driver;

	public ProfileUpdate (WebDriver driver) {
		this.driver = driver;
	}

	public void UpdateCV () {

		Properties prop = new Properties ();
		InputStream input = null;

		try {
			input = getClass ().getClassLoader ()
				.getResourceAsStream ("config.properties");
			prop.load (input);

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

			ProfilePage pg = new ProfilePage (driver);
			pg.UpdateCV (prop.getProperty ("FilePath"));

			System.out.println ("Latest CV Uploaded to Naukri.com!");
		}
	}

}
