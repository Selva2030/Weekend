package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AmazonProductConfirmationPage extends  AmazonAddCartPage {

	
	
	public AmazonProductConfirmationPage() {
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement contiueToPay;
	public WebElement getContiueToPay() {
		return contiueToPay;
	}
}
