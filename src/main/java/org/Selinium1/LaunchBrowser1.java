package org.Selinium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	
	public static void main(String[] args) {
		
		// Instanciate
		
		WebDriver driver = new ChromeDriver();
		
		// to launch browser
		driver.get("https://www.facebook.com/login/");
		
		//to get the web page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to print the current url of web page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//System.out.println(driver.getCurrentUrl());
		
		// to close the current open tab
		//driver.close();
		
		// to close entire tabs in browser
		driver.quit();
		
	}
	
//	public static void main(String[] args) {
//			
//			// Instanciate
//			
//			WebDriver driver = new ChromeDriver();
//			
//			// to launch browser
//			driver.get("https://www.facebook.com/login/");
//			
//			//to get the web page title
//			String title = driver.getTitle();
//			System.out.println(title);
//			
//			//to print the current url of web page
//			String currentUrl = driver.getCurrentUrl();
//			System.out.println(currentUrl);
//			
//			//System.out.println(driver.getCurrentUrl());
//			
//			// to close the current open tab
//			//driver.close();
//			
//			// to close entire tabs in browser
//			driver.quit();
//	
//	}

}
