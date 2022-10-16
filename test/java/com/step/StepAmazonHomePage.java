package com.step;

import com.base.Base;
import com.page.AmazonLoginPage;
 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepAmazonHomePage extends Base {
	AmazonLoginPage am ;
	@Given("User launch the Amazon Page")
	public void user_launch_the_amazon_page() {
		browserLaunch();
		windowMaximize();
		printURL();
		printTitle();
	}
	
	@When("user enter the product name {string} in textbox")
	public void user_enter_the_product_name_in_textbox(String productname) {
		am = new AmazonLoginPage();
	    am.getSearchTextBox().sendKeys(productname);
	    String text=am.getSearchTextBox().getText();
	    System.out.println(text);
	}
	@When("user click searchbutton")
	public void user_click_searchbutton() {
		am= new AmazonLoginPage();
		
		am.getSearchBtn().click();
	}
	@When("user select the product")
	public void user_select_the_product() {
		am = new AmazonLoginPage();
	     am.getSelectedProduct().click();
	}
	@When("user click addCart button")
	public void user_click_add_cart_button() throws InterruptedException {
		am= new AmazonLoginPage();
	    am.getAddCart().click();;
	}
	@When("user click Proceeded button")
	public void user_click_proceeded_button() {
		am =  new AmazonLoginPage();
	     am.getContiueToPay().click();
	}
	@When("User enter valid user name {string} in textbox")
	public void user_enter_valid_user_name_in_textbox(String user) {
		am = new AmazonLoginPage();
	    am.getUsername().sendKeys(user);
	    am.getSumbitForContinue().click();
	}
	@When("User enter valid password {string} in textbox")
	public void user_enter_valid_password_in_textbox(String string) {
	    am = new AmazonLoginPage();
		am.getPassword().click();
	    am.getSignIn();
	}



	
}
