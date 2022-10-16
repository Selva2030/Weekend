package com.step;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;
import com.page.FBNewAccountCreatePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepCredentialinFB extends Base {
	FBNewAccountCreatePage fb;
	@Given("User launch FB page")
	public void user_launch_fb_page() {
	    
		browserLaunch();
		windowMaximize();
		printTitle();
		printURL();
		
	}

@When("User click new Account creation button")
public void user_click_new_account_creation_button() {
	 fb = new FBNewAccountCreatePage();
	fb.getNewAccount().click();
}

	@When("User enter {string},{string},{string},{string},{string} inthe text box")
	public void user_enter_inthe_text_box(String fname, String lname, String email, String cemail, String pass) throws InterruptedException {
		Thread.sleep(3000);
	    fb = new FBNewAccountCreatePage();
	    fb.getfName().sendKeys(fname);;
	    fb.getlName().sendKeys(lname);;
	    fb.getrEmail().sendKeys(email);;
	    fb.getrEmailConfirm().sendKeys(cemail);;
	    fb.getPass().sendKeys(pass);;
	    
	}
	@When("user select day , month and year in drop down")
	public void user_select_day_month_and_year_in_drop_down() {
		 
		 fb = new FBNewAccountCreatePage();
		
		WebElement date=fb.getDay(); 
		Select s = new Select(date);
		s.selectByValue("10");
		
		WebElement month=fb.getMonth();
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");
		
		WebElement year=fb.getYear();
		Select s2 = new Select(year);
		s2.selectByValue("2016");
		
	    
	}
	@Then("user click sign up button")
	public void user_click_sign_up_button() {
	     
		 fb = new FBNewAccountCreatePage();
		fb.getGender().click();
		
		fb.getSubmit().click();
		
	}	 
		
}
