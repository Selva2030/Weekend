package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactionNormal extends Base  {
	public static void main(String[] args) {
		
		browserLaunch();
		windowMaximize();
		printURL();
		printTitle();
		AdactinSearchHotelDropDown  a = new AdactinSearchHotelDropDown ();
		
		 
		 
			WebElement loc = driver.findElement(By.name("location"));
			AdactinSearchHotelDropDown.searchLocation(loc);
		 
		
		
		
	}

}
