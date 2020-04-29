package com.synatx.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		String url;
		url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		System.out.println(driver.getTitle());
		
	}

}
