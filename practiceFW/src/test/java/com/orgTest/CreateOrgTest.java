package com.orgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
public void createOrg() {
	System.out.println("createorganizaion");
	System.out.println(System.getProperty("url"));
	System.out.println(System.getProperty("browser"));
	System.out.println(System.getProperty("username"));
	System.out.println(System.getProperty("password"));
	WebDriver driver=new FirefoxDriver();
}
}
