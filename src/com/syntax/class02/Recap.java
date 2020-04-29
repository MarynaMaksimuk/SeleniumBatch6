package com.syntax.class02;

public class Recap {
	public static void main(String[] args) {

		String Fburl = "https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(Fburl);
		
		
		System.out.println("Currant url is :: " + driver.getCurrantUrl());
		String Title = driver.getTitle();
		System.out.println("Title of the page is : " + Title);
		
		driver.close();

	}

}
