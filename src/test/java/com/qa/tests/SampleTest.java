package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SampleTest {
	
	//public static final String JENKINS_BUILD_PATH = "/var/lib/jenkins/workspace/GradleDemoProject/";
	
	@Test
	public void googleTitleTest()
	{
		//System.setProperty("webdriver.chrome.driver",JENKINS_BUILD_PATH+"drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver","/home/anita/eclipse-workspace/GradleDemoProject/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		driver.quit();
	}

}
