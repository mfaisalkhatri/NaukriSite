package com.Naukri.siteTest.Pages;

import static com.Naukri.siteTest.Pages.Sleeper.sleep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	
	public WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginSite(String userName, String password) {
		
		WebElement header = driver.findElement (By.className ("headGNBWrap"));
		WebElement loginMenu = header.findElement (By.id("login_Layer"));

		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		act.moveToElement (loginMenu).click ().perform ();
		
		WebElement emailId = driver.findElement (By.name("email"));
		act.click (emailId).sendKeys (userName).perform ();
		
		WebElement passWord = driver.findElement (By.id("pLogin"));
		act.click(passWord).sendKeys (password).perform ();
		
		//WebElement lgnBtn = driver.findElement(By.cssSelector ("#lgnFrmNew .blueBtn"));
		WebElement lgnBtn = driver.findElement (By.xpath ("/html/body/div[9]/div[2]/div[2]/form/div[8]/button"));
		act.click(lgnBtn).perform ();
		
		sleep ();
	}
	        
}

