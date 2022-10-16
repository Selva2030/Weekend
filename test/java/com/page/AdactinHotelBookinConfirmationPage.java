package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AdactinHotelBookinConfirmationPage extends AdactinHotelBookHotelPage {

	public AdactinHotelBookinConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=" //input[@name='order_no']")
	private WebElement orderno;


	public WebElement getOrderno() {
		return orderno;
	}

}
