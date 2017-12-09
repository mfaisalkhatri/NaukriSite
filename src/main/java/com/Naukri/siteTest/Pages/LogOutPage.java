package com.Naukri.siteTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOutPage {

	public WebDriver driver;
	public LogOutPage (WebDriver driver) {
	this.driver = driver;		
	}
	
	public void logOutSite () {
		
		WebElement mynaukriLink = driver.findElement(By.cssSelector(".topIcon.user"));
		Actions act = new Actions(driver);
		act.moveToElement (mynaukriLink).perform();
		
		WebElement logOutlink = driver.findElement (By.linkText ("Log Out"));
		act.moveToElement (mynaukriLink).moveToElement (logOutlink).click ().perform ();
		
	}
	
}
