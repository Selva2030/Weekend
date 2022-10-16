package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AdactinHotelSearchPage extends  AdactinLoginPage {
	
	public AdactinHotelSearchPage() {
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@name='location']")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement norooms;
	 
	@FindBy(id="adult_room")
	private WebElement adaultsperroom;
	
	
	@FindBy(id="child_room")
	private WebElement childrenperroom;
	
	
	@FindBy(id="Submit")
	private WebElement search;


	public WebElement getLocation() {
		return location;
	}


	 


	public WebElement getHotels() {
		return hotels;
	}


	 


	public WebElement getRoomtype() {
		return roomtype;
	}


	 


	public WebElement getNorooms() {
		return norooms;
	}


	 


	public WebElement getAdaultsperroom() {
		return adaultsperroom;
	}


	 


	public WebElement getChildrenperroom() {
		return childrenperroom;
	}


	 


	public WebElement getSearch() {
		return search;
	}


	 
	
	
	
	
	

}
