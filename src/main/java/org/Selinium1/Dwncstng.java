package org.Selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dwncstng {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Txtuser = driver.findElement(By.id("email"));
	   //Txtuser.sendkeys("smart");
	
		WebElement Txtpass = driver.findElement(By.id("pass"));
		//Txtpass.sendkeys("12345");
		
		//Instanciate (obj creation)
		// downcasting---Big to small --->child ref = (child)parent-ref;
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//					arg1										arg2
		js.executeScript("arguments[0].setAttribute('value','Smart')", Txtuser);
			//																0		1
		//js.executeScript("arguments[1].setAttribute('value','12345')",Txtuser, Txtpass);
		
		
		js.executeScript("arguments[0].setAttribute('value','12345')", Txtpass);
		
		
	}

}
