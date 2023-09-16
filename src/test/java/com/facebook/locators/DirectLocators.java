package com.facebook.locators;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
WebDriver driver;
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	public void idLocators() {
		driver.findElement(By.id("email")).sendKeys("hill");
		
	}
	@Test
	public void nameLocator() {
		driver.findElement(By.name("pass")).sendKeys("ghhg");
	}

	@Test
	public void linkTextLocators() {
     driver.findElement(By.linkText("Forgot password?")).click();
		
	}
	@Test
	public void partialLinkTest() {
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
	}
	
}
