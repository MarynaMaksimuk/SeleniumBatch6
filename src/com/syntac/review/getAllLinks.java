package com.syntac.review;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synatx.utilPackage.BaseClass;


public class getAllLinks extends BaseClass{
	public static void main(String[] args) {
		setUp();
		
		List<org.openqa.selenium.WebElement>AllLinks= driver.findElements(By.tagName("a"));
		int numOfLinks=AllLinks.size();
		System.out.println(numOfLinks);
		
		for (WebElement link:AllLinks) {
			String textOfLinks=link.getText();
			String links= link.getAttribute("href");
			System.out.println(textOfLinks+" "+links);
			
		}
		
	}

}
