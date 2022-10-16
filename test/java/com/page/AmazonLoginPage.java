package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AmazonLoginPage extends  AmazonProductConfirmationPage  {
public AmazonLoginPage() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@type='email']")
private WebElement username;
@FindBy(xpath="//input[@type='submit']")
private WebElement sumbitForContinue;
@FindBy(xpath="//input[@type='password']")
private WebElement password;

public WebElement getUsername() {
	return username;
}
 
public WebElement getSumbitForContinue() {
	return sumbitForContinue;
}
 
public WebElement getPassword() {
	return password;
}
 
public WebElement getSignIn() {
	return signIn;
}
 
@FindBy(xpath="//input[@type='submit']")
private WebElement signIn;


}
