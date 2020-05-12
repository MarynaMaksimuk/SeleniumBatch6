package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement maleRadio= driver.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println(maleRadio.isSelected());
		
		//first way to click on radio button
		
		maleRadio.click();
		System.out.println(maleRadio.isSelected());
		// second day to click on radio button
		List<WebElement> listRadio= driver.findElements(By.xpath("//input[@name='profession']"));
		int listSize= listRadio.size();
		System.out.println(listSize);
		String valuetobeselected="Manual Tester";
		for (WebElement profession : listRadio) {
			if(profession.isEnabled()) {
				
				String value=profession.getAttribute("value");
				System.out.println(value);
				
				if (value.equals(valuetobeselected)) {
					profession.click();
					break;
				}
			}
		}

	}

}
