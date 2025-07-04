package com.orgTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class browserstackcodeTest {
@Test
public void sampletest() throws MalformedURLException, InterruptedException {
	MutableCapabilities capabilities = new MutableCapabilities();
	HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
	capabilities.setCapability("browserName", "Chrome");
	bstackOptions.put("os", "Windows");
	bstackOptions.put("osVersion", "10");
	bstackOptions.put("browserVersion", "120.0");
	bstackOptions.put("consoleLogs", "info");
	capabilities.setCapability("bstack:options", bstackOptions);

	String username="santhoshnagaraj_UHAQjl";
	String password="9ms7ynKvxSP8qA6grxGw";
	RemoteWebDriver driver=new RemoteWebDriver(new URL("https://"+username+":"+password+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	System.out.println(driver.getCurrentUrl());
    driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
    driver.findElement(By.xpath("//span[text()='Bengaluru']/..//div")).click();
	driver.close();
   
}
}
