package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AmazonProductSelectionPage extends  AmazonHome{

	public AmazonProductSelectionPage() {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement selectedProduct;
	
	
	public WebElement getSelectedProduct() {
		return selectedProduct;
	}
	 
		
	}
 
