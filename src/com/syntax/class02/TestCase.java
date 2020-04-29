package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;


public class TestCase {
	public static void main(String[] args) {
		
		String url="http://newtours.demoaut.com/mercuryregister.php?osCsid=8698456e24b488e7daaf149c1a816601";
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
				
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.name("firstName")).sendKeys("Marina");
		driver.findElement(By.name("lastName")).sendKeys("Maksimuk");
		driver.findElement(By.name("phone")).sendKeys("3456789009");
		driver.findElement(By.name("register")).click();
		
		
	}

}
