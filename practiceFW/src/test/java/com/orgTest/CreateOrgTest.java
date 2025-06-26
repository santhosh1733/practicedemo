package com.orgTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class CreateOrgTest {
	
	@Test(groups = "smoke")
	public void createOrg() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
	}
}
