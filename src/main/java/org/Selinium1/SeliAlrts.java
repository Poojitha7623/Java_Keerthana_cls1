package org.Selinium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliAlrts {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//https://demo.automationtesting.in/Alerts.html
		driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		driver.manage().window().maximize();
		
		
	//Prompt alert
		
		//(//a[@class='analystic'])[3]------	//a[text()='Alert with Textbox '] 
		////button[@class='btn btn-info']
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a = driver.switchTo().alert();
		
		// To pass values in alert keys
		a.sendKeys("Smartskills");	
		
		// to click ok
		a.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Confirm alert
//		// xpath(//a[@class='analystic'])[2] ---  //a[text()='Alert with OK & Cancel ']
//		//button[@class='btn btn-primary'] ---
//		
//		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		
//		Alert a = driver.switchTo().alert();
//		
//		// to click ok
//		//a.accept();
//		a.dismiss();
//		
////		
		
		

		// simple alert
		
//		// to click simple alert
//		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		
//		
//		// simple alert
//		Alert a = driver.switchTo().alert();
//		
//		//Toget the text from alert box
//		String txt = a.getText();
//		System.out.println(txt);
//		
//		// to click ok
//		a.accept();
		
		
		
	}

}
