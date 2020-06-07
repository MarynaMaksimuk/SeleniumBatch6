package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("http://166.62.36.207/syntaxpractice/");
		
		driver.manage().window().maximize();
		List <WebElement> elements=driver.findElements(By.xpath("//li[@class='tree-branch']"));
		for (WebElement items:elements) {
			
			String name=items.getText();
			
			if(name.equals("Table")) {
				items.click();
				break;
			}
			}
		}
}
		
		
			
		
	
	


