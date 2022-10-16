package com.step;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
 
import com.page.AdactinHotelBookinConfirmationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepAdactinLoginCredentials extends AdactinHotelBookinConfirmationPage {
	AdactinHotelBookinConfirmationPage a ;
	@Given("to Launc Adactin Hotel  page")
	public void to_launc_adactin_hotel_page() {
		browserLaunch();
		windowMaximize();
		printURL();
		printTitle();
		
	}
	@When("User enter valid  {string} User name in text box")
	public void user_enter_valid_user_name_in_text_box(String username) {
		a = new AdactinHotelBookinConfirmationPage();
		a.getEmail().sendKeys(username);
	}
	@When("User enter valid password {string} password in text box")
	public void user_enter_valid_password_password_in_text_box(String password) {
		a = new AdactinHotelBookinConfirmationPage();
		a.getPass().sendKeys(password);
	}
	
	@When("User Click login button")
	public void user_click_login_button() {
		a = new AdactinHotelBookinConfirmationPage();
	    a.getLogin().click();
	    	}
	@When("User Select the Hotels")
	public void user_select_the_hotels() {
		a = new AdactinHotelBookinConfirmationPage();
	   WebElement location = a.getLocation();
	   Select s = new Select(location);
	   s.selectByIndex(3);
	   
	   WebElement hotel = a.getHotels();
	   Select s1 = new Select(hotel);
	   s1.selectByIndex(2);
	   
	   WebElement roomType = a.getRoomtype();
	   Select s2 = new Select(roomType);
	   s2.selectByIndex(2);
	   
	   WebElement noofRooms = a.getNorooms();
	   Select s3 = new Select(noofRooms);
	   s3.selectByIndex(1);
	   
	   WebElement adaluts = a.getAdaultsperroom();
	   Select s4 = new Select(adaluts);
	   s4.selectByIndex(1);
	   
	   WebElement children = a.getChildrenperroom();
	   Select s5 = new Select(children );
	   s5.selectByIndex(1);
	   
	   a.getSearch().click();
	   
	   
	}
	@When("user Confirm theHotel")
	public void user_confirm_the_hotel() {
		a = new AdactinHotelBookinConfirmationPage();
	   a.getRadioBtnSelect().click();
	    a.getCont().click();
	}
	@When("User enter the firstname,lname,add,ccardNo,CVV {string},{string},{string},{string},{string} user in text box")
	public void user_enter_the_firstname_lname_add_ccard_no_cvv_user_in_text_box(String firstname, String lname, String add, String ccardNo, String CVV ) throws InterruptedException {
		a.getFirstName().sendKeys(firstname);
		Thread.sleep(2000);
	    a.getLastName().sendKeys(lname);
	    a.getAddress().sendKeys(add);
	    a.getCreditCardNo().sendKeys(ccardNo);	
	    a.getCVVNo().sendKeys(CVV );
	    WebElement selectCardType =a.getCreditCardType();
	    Select ss= new Select(selectCardType);
	    ss.selectByValue("MAST");
	    WebElement selectExpiryMonth =a.getCcExpiryMonth();
	    Select ss1= new Select(selectExpiryMonth);
	    ss1.selectByIndex(11);
	    WebElement selectExpiryYear =a.getCcExpiryYear();
	    Select ss2= new Select(selectExpiryYear);
	    ss2.selectByValue("2022");
	    
	}
	@When("User click book now btn")
	public void user_click_book_now_btn() {
		a = new AdactinHotelBookinConfirmationPage();
	     a.getBook().click();
	     	}
	@Then("User Capture the OrderNo")
	public void user_capture_the_order_no() throws IOException, InterruptedException {
		Thread.sleep(30000);
		a = new AdactinHotelBookinConfirmationPage();
		TakesScreenshot tk =(TakesScreenshot) driver;
		File source =tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\JAYAGAANTHAN\\Desktop\\sn tESTING\\ScreenShots\\adactin1.png");
		FileUtils.copyFile(source,dest);
	}



	
}
