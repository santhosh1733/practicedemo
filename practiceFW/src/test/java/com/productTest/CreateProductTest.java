package com.productTest;

import org.testng.annotations.Test;

public class CreateProductTest {
	
	@Test
public void createProduct() {
	
	System.out.println(System.getProperty("url"));
	System.out.println(System.getProperty("browser"));
	System.out.println(System.getProperty("username"));
	System.out.println(System.getProperty("password"));
}
}
