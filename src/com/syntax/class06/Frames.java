package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synatx.utilPackage.BaseClass;

public class Frames extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		setUp();  //uncomment uitestpractice.com/Students/Switchto
		
		//1st way switching to the frame------using index
		
		driver.manage().window().maximize();
		String text= driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(0);
		
		WebElement name= driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		Thread.sleep(2000);
		name.clear();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		// by name or ID
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.id("name")).sendKeys("Sarmet");
		name.clear();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// by web element
		WebElement firstFrame= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		
		name.sendKeys("Asel");
		
		Thread.sleep(2000);
		tearDown();
		
	}

}
