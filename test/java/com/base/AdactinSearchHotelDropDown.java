package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinSearchHotelDropDown {
	
	
public static void searchLocation(WebElement Loc )
{
	Select s = new Select(Loc);
	
	 s.selectByIndex(0);
	
	}

public static void searchHotels(WebElement hotels )
{
	Select s = new Select(hotels);
	
	 s.selectByIndex(1);
	
	}
	
public static void roomType(WebElement roomType )
{
	Select s = new Select(roomType);
	
	 s.selectByIndex(1);
	
	}

public static void noofroom(WebElement roomcount )
{
	Select s = new Select(roomcount);
	
	 s.selectByIndex(1);
	
	}
public static void adaluts(WebElement adaluts )
{
	Select s = new Select(adaluts);
	
	 s.selectByIndex(1);
	
	}
public static void children(WebElement children )
{
	Select s = new Select(children);
	
	 s.selectByIndex(1);
	
	}
public static void search(WebElement search )
{
	Select s = new Select(search);
	
	 s.selectByIndex(1);
	
	}		
}

 
