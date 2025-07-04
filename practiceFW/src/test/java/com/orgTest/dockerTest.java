package com.orgTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class dockerTest {
	RemoteWebDriver driver;
	//@Parameters("browsername")
public void docker() throws MalformedURLException, InterruptedException {
	URL ipadd = new URL("http://localhost:4444");
	
	String bn=System.getProperty("browser");
	if(bn.equals("chrome")) {
		ChromeOptions option=new ChromeOptions();
		 driver=new RemoteWebDriver(ipadd,option);
	}else if(bn.equals("firefox")) {
		FirefoxOptions option=new FirefoxOptions();
		 driver=new RemoteWebDriver(ipadd,option);
	}else if(bn.equals("edge")) {
		EdgeOptions option=new EdgeOptions();
		 driver=new RemoteWebDriver(ipadd,option);
	}
	Thread.sleep(10000);
	driver.get("https://google.com");
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(10000);
	driver.close();
}
}
