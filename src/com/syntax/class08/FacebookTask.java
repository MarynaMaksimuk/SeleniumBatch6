package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.synatx.utilPackage.ConfigsReader;

public class FacebookTask extends commonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.manage().window().maximize();
		
		WebElement firstName= driver.findElement(By.id("u_0_m"));
		sendText(firstName, ConfigsReader.getPropery("firstname"));
		
		
		 WebElement lastName=driver.findElement(By.id("u_0_o")); 
		 sendText(lastName, "Smith"); 
		 WebElement phoneNumber=driver.findElement(By.id("u_0_r"));
		 sendText(phoneNumber, "212-555-5555");
		
		 WebElement month= driver.findElement(By.id("month"));
		 selectDDvalue(month, "Apr");
		 
		WebElement day= driver. findElement(By.id("day"));
		selectDDvalue(day, "24");
		
		
			}
		}
		
		
	



