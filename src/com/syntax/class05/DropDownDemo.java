package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synatx.utilPackage.BaseClass;

public class DropDownDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		setUp();
		WebElement element= driver.findElement(By.id("select-demo"));
		 Select select=new Select (element);
		 // 1 way - using index
		 
		 List <WebElement>options= select.getOptions();
		 System.out.println("Number of options "+options.size());
		 
		 
		 select.selectByIndex(3);
		 
		 for (int i=0; i<options.size(); i++ ) {
			 select.selectByIndex(i);
			 Thread.sleep(2000);
		 }
		 Thread.sleep(3000);
		 tearDown();
	}
		// 2 way ----- using visible text
		//2 way------ByValue();
	
	
}
