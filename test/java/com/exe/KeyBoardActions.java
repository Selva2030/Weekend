package com.exe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions extends Base  {
	
	
	public static void main(String[] args) throws AWTException {
		
	
	browserLaunch();
	windowMaximize();
	printURL();
	printTitle();
	
	WebElement mobiles= driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions ac = new Actions(driver);
	ac.contextClick(mobiles).perform();
	
	Robot r = new Robot();
	for(int i=1;i<=6;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
	
	
	}
}

