package com.orgTest;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest {
	
	
	
	@BeforeClass
	public static void setup() {
	    WebDriverManager.chromedriver().clearDriverCache().setup();
	    WebDriverManager.chromedriver().clearResolutionCache().setup();
	}
	@Test
	public void createOrg() {
		System.out.println("createorganizaion");
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		WebDriver driver = new ChromeDriver(options);
	}
}
