package com.Naukri.siteTest.Pages;

public class Sleeper {
	
	public static void sleep () {
		
		try {
			Thread.sleep (2000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
