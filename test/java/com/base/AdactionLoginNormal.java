package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactionLoginNormal extends Base  {
public static void main(String[] args) {
	
public   void userPassword()
	{
		 
	 
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("SELVA123");
		String text=pass.getAttribute("value");
	    System.out.println("The Password text box Value is   "+text);

	}
}
}
