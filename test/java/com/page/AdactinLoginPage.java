package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AdactinLoginPage extends Base {
	
	public AdactinLoginPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(id="username")
	 private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	 
	@FindBy(id="password")
	 private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}

	
	@FindBy(id="login")
	 private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
//	@FindBy(xpath="//div[contains(text(),'entered')]")
//	private WebElement errormsg;
//
//	public WebElement getErrormsg() {
//		return errormsg;
//	}

	 

	

}
