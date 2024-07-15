package org.Selinium1;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import freemarker.template.utility.Execute;

public class Js_rtnarg02 {
	
	
	public static void main(String[] args) throws AWTException,InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("Selinium");
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Selinium");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Smart");
		
		//driver.findElement(By.id("pass")).sendKeys("Smart");
		
//		String attribute = txtuser.getAttribute("value");
//		//String attribute = txtuser.getAttribute("type");
//		
//		System.out.println("username id:" +attribute);
	
		
		// it gives null coz, thevalues we pass is throug sendkeys but try to rtn 
		// is with js script..   we shpuld pass through js to rtn in js
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		Object execute = js.executeScript("return arguments[0].getAttribute('value')", txtuser);
//		
//		//js.executeScript("return arguments[0].getAttribute('value')", txtpass);		
//		System.out.println(execute);
		
		
		
	}

}
