package com.syntax.class02;

public class TestWebDriver {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.close();
		
		
		
	}

}
