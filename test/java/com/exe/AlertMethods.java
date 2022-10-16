package com.exe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMethods extends Base  {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	WebElement simple=driver.findElement(By.xpath("//input[@name='alert']"));
	WebElement confirmation=driver.findElement(By.xpath("//input[@name='confirmation']"));
	simple.click();
	Alert a= driver.switchTo().alert();
	String text=a.getText();
	System.out.println(text);
	Thread.sleep(2000);
	a.accept();
	
	
	confirmation.click();
	Alert c =driver.switchTo().alert();
	
	String t=c.getText();
	System.out.println(t);
	Thread.sleep(2000);
	c.accept();
	
	confirmation.click();
	Alert c1 =driver.switchTo().alert();
	
	String t1=c.getText();
	System.out.println(t1);
	Thread.sleep(2000);
	c1.dismiss();
	WebElement prompt=driver.findElement(By.xpath("//input[@name='prompt']"));
	prompt.click();
	Alert c2 =driver.switchTo().alert();
	c2.sendKeys("HAI");
	Thread.sleep(2000);
	
	
	
}
}
