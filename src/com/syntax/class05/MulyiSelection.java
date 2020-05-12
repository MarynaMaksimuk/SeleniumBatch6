package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synatx.utilPackage.BaseClass;

public class MulyiSelection  {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= BaseClass.setUp();
	WebElement multiSelect= driver.findElement(By.id("continentsmultiple"));
	
	Select select= new Select(multiSelect);
	boolean isMultiple= select.isMultiple();
	System.out.println("This DropDown is Multiple Select? "+isMultiple);
	if(isMultiple) {
		select.selectByVisibleText("North America");
		Thread.sleep(3000);
		select.deselectAll();
	}

}
}