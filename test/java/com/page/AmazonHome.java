package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AmazonHome extends Base {

	public AmazonHome() {
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchBtn;

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	 

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	 
	
	
	
}
