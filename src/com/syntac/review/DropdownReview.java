package com.syntac.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synatx.utilPackage.BaseClass;

public class DropdownReview extends BaseClass {
	public static void main(String[] args) {
		setUp();
		driver.manage().window().maximize();
		List <WebElement> allDrop= driver.findElements(By.tagName("a"));
		for (WebElement oneDD:allDrop) {
			String text=oneDD.getText();
			System.out.println(text);
			if(text.equals("List Box")) {
			oneDD.click();
			
		}
	}List<WebElement>listofDD= driver.findElements(By.tagName("li"));
	for (WebElement oneItem:listofDD) {
		String item=oneItem.getText();
		if(item.equals("Bootstrap List Box")) {
			oneItem.click();
			
		}
		if(item.equals("Morbi leo risus")) {
			oneItem.click();
			break;
		}
	}
		
	}

}
