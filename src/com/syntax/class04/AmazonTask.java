package com.syntax.class04;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		int count=0;
		for (WebElement text:list) {
			String t=text.getText();
			if(!t.isEmpty()) {
				System.out.println(t);
				count++;
			}
		}System.out.println("Total number of elements "+count);
		driver.quit();
	}
}
