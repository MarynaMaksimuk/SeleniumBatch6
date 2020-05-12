package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synatx.utilPackage.BaseClass;

public class FramePractice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= BaseClass.setUp();
		
		
		driver.switchTo().frame("FrameOne");
		boolean isDispayed= driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("The logo is displayed "+isDispayed);
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean isEnabled= driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("The button is enabled "+isEnabled);
		Thread.sleep(2000);
		BaseClass.tearDown();
	}

}
