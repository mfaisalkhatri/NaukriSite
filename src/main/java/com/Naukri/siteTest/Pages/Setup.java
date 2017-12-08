package com.Naukri.siteTest.Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments ("--disable-notifications");
		driver = new ChromeDriver (ops);
		driver.get(webSite);
		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		windowHandling ();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	public void windowHandling () {
		String MainWindow = driver.getWindowHandle ();
		Set <String> s1 = driver.getWindowHandles ();
		Iterator <String> i1 = s1.iterator ();

		while (i1.hasNext ()) {
			String ChildWindow = i1.next ();

			if (!MainWindow.equalsIgnoreCase (ChildWindow)) {
				driver.switchTo ()
					.window (ChildWindow);
				driver.close ();

			}
			driver.switchTo().window(MainWindow);	
		}
	}	
	

}
