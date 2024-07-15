package org.Selinium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seli2act {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	//Mouse Actions
		
		Actions a = new Actions(driver);
		
		WebElement Userid = driver.findElement(By.id("email"));
		//Userid.sendKeys("SMART");
		// to perform actions as upper case the values
		a.keyDown(Keys.SHIFT).sendKeys("smart").keyUp(Keys.SHIFT).build().perform();
		// to double click on the value
		a.doubleClick(Userid).perform();
		//to right click 
		a.contextClick(Userid).perform();
		
	// Keyboard Actions
		
		Robot r = new Robot();
		// to select copy opt in the context
		for (int i = 0; i < 3; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}

}
