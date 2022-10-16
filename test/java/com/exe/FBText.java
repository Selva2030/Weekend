package com.exe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.RenderingHints.Key;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FBText extends Base {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	
	browserLaunch();
	windowMaximize();
	
	WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("SELVA");
	String text=email.getAttribute("value");
	email.click();
	Actions ac = new Actions(driver);
	ac.contextClick(email).perform();
	
	//r.keyPress(KeyEvent.VK_CONTROL);
	Robot r = new Robot();
	for(int i=1; i<=4; i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
		r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease((KeyEvent.VK_ENTER));
           r.keyPress(KeyEvent.VK_CONTROL);
           r.keyRelease(KeyEvent.VK_C);
           r.keyPress(KeyEvent.VK_CONTROL);
           r.keyRelease(KeyEvent.VK_C);

           
           WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
           ac.doubleClick(pass).perform();
           
           r.keyPress(KeyEvent.VK_CONTROL);
           r.keyRelease(KeyEvent.VK_V);
           r.keyPress(KeyEvent.VK_CONTROL);
           r.keyRelease(KeyEvent.VK_V);
           
//   Actions ac = new Actions(driver);
//   ac.moveToElement(email).click();
//   ac.keyDown(Keys.CONTROL).sendKeys("a");
//   ac.sendKeys("c");
//   WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
//   
//	ac.moveToElement(pass).click().keyDown(Keys.CONTROL).sendKeys("v").perform();
//	
//	
	

	
	
	 
	 
    
    
    
  
     
    Thread.sleep(1000);
	}
}
