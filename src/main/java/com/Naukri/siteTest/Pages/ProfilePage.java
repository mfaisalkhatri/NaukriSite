package com.Naukri.siteTest.Pages;

import static com.Naukri.siteTest.Pages.Sleeper.sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {

	
	public WebDriver driver;
	
	public ProfilePage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void UpdateCV (String filePath) {
		
		WebElement viewProfile = driver.findElement (By.linkText ("View Profile"));
		
		Actions act = new Actions(driver);
		act.click (viewProfile).perform ();
		
		WebElement uploadLink = driver.findElement (By.id ("uploadLink"));
		act.click (uploadLink).perform ();
		
		WebElement attachCV = driver.findElement (By.id("attachCV"));
		attachCV.sendKeys (filePath);
		
		sleep();
		
		WebElement saveCV = driver.findElement (By.cssSelector("button.w85bt.fl"));
		act.click(saveCV).perform ();
		
		sleep();
	}
	
	
	
	
	
	
}
