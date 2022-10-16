package com.exe;

 
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public static WebDriver driver;
	
	public static void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYAGAANTHAN\\eclipse-workspace\\BankDetails\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
	}
	
	public static void windowMaximize()
	{
		driver.manage().window().maximize();
	}
	
	
	public static void printURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println("THE Current URL IS   "+url);
	}
	
	public static void printTitle()
	{
		String title=driver.getTitle();
		System.out.println("THE Current Title IS   "+title);
	}
	
	public static  void StartDate()
	{
		Date d= new Date();
		System.out.println(d);
	}
	
	public static  void EndDate()
	{
		Date d= new Date();
		System.out.println("Ending Time is "+d);
	}
	public static  void screenshots() throws IOException
	{
		TakesScreenshot tk =(TakesScreenshot) driver;
		File source =tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\JAYAGAANTHAN\\Desktop\\sn tESTING\\ScreenShots\\fb.png");
		FileUtils.copyFile(source,dest);
	}
	
	
	public static void inCorrectLoginMsg() throws InterruptedException

	{
		Thread.sleep(2000);
		WebElement errorMsg=driver.findElement(By.xpath("//div[contains(text(),'entered')]"));
		String msg=errorMsg.getText();
		System.out.println("The Error MSG IS  "+msg);
	}

	
	
	
}
