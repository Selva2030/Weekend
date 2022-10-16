package com.exe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBTable {

	
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYAGAANTHAN\\eclipse-workspace\\BankDetails\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		 driver.manage().window().maximize();
		 
		WebElement table=driver.findElement(By.tagName("table"));
		WebElement tableHead=driver.findElement(By.tagName("tbody")); 
		WebElement tableRow=driver.findElement(By.tagName("tr"));
		List<WebElement> headings=tableRow.findElements(By.tagName("th"));
		for(int i=0;i<headings.size();i++)
		{
			System.out.println(headings.get(i).getText());
		}
		
		List<WebElement> rows=tableHead.findElements(By.tagName("td"));
		for(int i=0;i<rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
		}
	}
}
