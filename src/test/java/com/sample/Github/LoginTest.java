package com.sample.Github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
public  static WebDriver driver;

@BeforeTest
public void setUp (){
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
	 driver=new ChromeDriver ();
			
	
}
	@Test
	public void doLogin (){
		System.out.println("Executing Login Test ");
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		//*[@id='email']
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mjrj822@gmail.com");
        
      //*[@id='pass']
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcdefgh");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Looking into Facebook Account");
		
		
	}
	@AfterTest
	public void QuitDriver (){
		if(driver!=null)
			driver.close();
}
}
