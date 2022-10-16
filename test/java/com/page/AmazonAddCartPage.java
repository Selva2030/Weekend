package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AmazonAddCartPage extends AmazonProductSelectionPage{
	
	public AmazonAddCartPage() {
		 PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//input[@id='add-to-cart-button']") 
private WebElement addCart;
public WebElement getAddCart() {
	return addCart;
}
 


 



}
