package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionAmazonClassWork {
	WebDriver driver;

	@Given("User launch Amazon Webpage")
	public void user_launch_amazon_webpage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

	@When("User Click the Mobiles")
	public void user_click_the_mobiles() {
        String title = driver.getTitle();
        System.out.println(title);
		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		mobiles.click();
	}

	@When("User Enter the Product Name {string} in text box")
	public void user_enter_the_product_name_in_text_box(String pName) {
		WebElement textbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		textbox.sendKeys(pName);
	}

	@When("User Click search button")
	public void user_click_search_button() {
		WebElement searchbtn = driver.findElement(By.xpath("//*[@type='submit']"));
		searchbtn.click();
	}

}
