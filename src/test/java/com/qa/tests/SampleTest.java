package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SampleTest {
	
	@Test
	public void googleTitleTest()
	{
		System.setProperty("webdriver.chrome.driver","/home/anita/eclipse-workspace/GradleDemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		driver.quit();
	}

}
