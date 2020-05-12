package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synatx.utilPackage.BaseClass;

public class AlertBox extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= setUp();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//handling simple alert
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		
		String simpleAlertText= simpleAlert.getText();
		simpleAlert.accept();
		System.out.println("This is simple alert text "+simpleAlertText);
		Thread.sleep(1000);
		
		
		//Handling confirmation alert
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(1000);
		
		Alert confirmation= driver.switchTo().alert();
		
		Thread.sleep(1000);
		String confAlertText=confirmation.getText();
		Thread.sleep(1000);
		System.out.println(confAlertText);
		Thread.sleep(1000);
		confirmation.dismiss();
		
		//Handling promp alerts/confirmation alerts by providing some confirmation message
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert= driver.switchTo().alert();
		String text= promptAlert.getText();
		System.out.println(text);
		promptAlert.sendKeys("Alex");
		promptAlert.accept();
		String text1=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		if(text1.equals("Alex")) {
			System.out.println("Text was entered");
		}else
		driver.quit();
		
		
	}

}
