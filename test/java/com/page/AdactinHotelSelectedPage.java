package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AdactinHotelSelectedPage extends AdactinHotelSearchPage {
 
 
public AdactinHotelSelectedPage() {
	
	  PageFactory.initElements(driver,this);
	 
}

@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement radioBtnSelect;

@FindBy(id="continue")
private WebElement cont;

public WebElement getRadioBtnSelect() {
	return radioBtnSelect;
}

 

public WebElement getCont() {
	return cont;
}

 



}