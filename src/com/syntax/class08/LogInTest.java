package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.synatx.utilPackage.ConfigsReader;

public class LogInTest extends commonMethods{
	public static void main(String[] args) {
		setUp();
		
		WebElement userName= driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getPropery("username"));
		
		WebElement password=driver.findElement(By.id("password"));
		sendText(password, ConfigsReader.getPropery("password"));
		
		tearDown();
	}

}
