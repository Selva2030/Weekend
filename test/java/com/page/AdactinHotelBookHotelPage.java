package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelBookHotelPage extends AdactinHotelSelectedPage {

	public AdactinHotelBookHotelPage() {
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement  firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement  lastName;
	
	@FindBy(xpath="//textArea[@name='address']")
	private WebElement  address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement  creditCardNo;
	
	@FindBy(xpath=" //select[@name='cc_type']")
	private WebElement  creditCardType;
	
	@FindBy(xpath=" //select[@name='cc_exp_month']")
	private WebElement  ccExpiryMonth;
	
	@FindBy(xpath=" //select[@name='cc_exp_year']")
	private WebElement  ccExpiryYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement   CVVNo;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;
	

	public WebElement getBook() {
		return book;
	}



	 



	public WebElement getFirstName() {
		return firstName;
	}

	 

	public WebElement getLastName() {
		return lastName;
	}

	 

	public WebElement getAddress() {
		return address;
	}

	 

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	 

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	 

	public WebElement getCcExpiryMonth() {
		return ccExpiryMonth;
	}
 

	public WebElement getCcExpiryYear() {
		return ccExpiryYear;
	}

	 

	public WebElement getCVVNo() {
		return CVVNo;
	}

	 
	
	
	
	
}
