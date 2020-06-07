package com.syntax.class10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url="http://www.seleniumframework.com/Practiceform/";
		driver.get(url);
		
		WebElement newBrowserButton= driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		newBrowserButton.click();
		String parentWindow=driver.getWindowHandle();
		
		driver.close();
		
		
		Set<String>allWindows=driver.getWindowHandles();
		Iterator <String> it=allWindows.iterator();
		while(it.hasNext()) {
			String childWindow=it.next();
			if(!it.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		WebElement header= driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing and ATDD Automation')]"));
		System.out.println(header.getText());
	}

}
