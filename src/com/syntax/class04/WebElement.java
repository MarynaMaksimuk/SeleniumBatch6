package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String userName="Tester";
	public static String password="Test";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement userName= (WebElement) driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		
		
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).submit();
		
		driver.findElement(By.xpath("//h1(text()='Web Orders']"));
		driver.findElement(By.xpath("//div[@class='login_info']"));
		
	}

}
