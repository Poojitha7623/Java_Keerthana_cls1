package org.Selinium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seli2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://snapdeal.com/");
		

		//to get the web page title
		String title = driver.getTitle();
		System.out.println(title);
		
		// to enter input for seraching
		//(//input[@name='keyword'])[1] or //input[@id='inputValEnter']
		
		WebElement input = driver.findElement(By.id("inputValEnter"));
		input.sendKeys("Headphones");
		
		// to click on search button
		//button[@onclick='submitSearchForm('go_header');']....//span[@class='searchTextSpan'].....
		WebElement Search = driver.findElement(By.xpath("//span[text()='Search']"));
	     Search.click();
		
	    // WebElement erphn = driver.findElement(By.xpath("//p[@title='Tecsox PowerHouse Earbud In Ear Bluetooth Earphone 45 Hours Playback Bluetooth IPX5(Splash Proof) Powerfull Bass -Bluetooth V 5.1 Black']"));
	     
	     WebElement erphn = driver.findElement(By.xpath("//p[contains(text(),'Tecsox PowerHouse Earbud In Ear')]"));
	     erphn.click();
	     
	   
	     // to click add to Cart
	     // //span[text()='add to cart']     ....//div[@id='add-cart-button-id']
	     WebElement Cart = driver.findElement(By.xpath("/div[@id='add-cart-button-id']"));
	     Cart.click();   
	     
	}

}
