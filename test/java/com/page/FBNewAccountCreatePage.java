package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class FBNewAccountCreatePage extends Base {
	public FBNewAccountCreatePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//*[text()='Create New Account']")
	private WebElement newAccount;
	
	@FindBy(name="firstname")
	private WebElement fName;
	
	@FindBy(xpath="//*[@name='lastname']")
	private WebElement lName;
	
	@FindBy(xpath="//*[@name='reg_email__']")
	private WebElement rEmail;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement rEmailConfirm;
	
	@FindBy(xpath="//*[@name='reg_passwd__']")
	private WebElement pass;
	
	@FindBy(id="day")
	private WebElement day;

	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//input [@name='sex']")
	private WebElement gender;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getrEmail() {
		return rEmail;
	}

	public WebElement getrEmailConfirm() {
		return rEmailConfirm;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
