package com.Naukri.siteTest.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setup {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void siteUp () {
	
		final String exe = "chromedriver.exe";
		final String path = getClass ().getClassLoader ()
			.getResource (exe)
			.getPath ();
		final String webSite = "http://www.naukri.com";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver ();
		driver.get(webSite);
		driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	

}
