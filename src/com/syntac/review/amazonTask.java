package com.syntac.review;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synatx.utilPackage.BaseClass;

public class amazonTask extends BaseClass{
	public static void main(String[] args) {
		setUp();
		
		WebElement searchDD= driver.findElement(By.id("searchDropdownBox"));
		Select selectDD=new Select(searchDD);
		List <WebElement>ddOptions= selectDD.getOptions();
		for (WebElement items:ddOptions) {
			String optionText=items.getText();
			System.out.println(optionText);
		}
		selectDD.selectByVisibleText("Books");
		
		WebElement searchTextBox= driver.findElement(By.cssSelector("input[type='text']"));
		searchTextBox.sendKeys("Harry Potter");
		WebElement searchButton= driver.findElement(By.xpath("//input[@class='nav-input'and@type='submit']"));
		searchButton.click();
		List<WebElement>bookSerCheckbox= driver.findElements(By.className("a-spacing-micro"));
		for (WebElement bookSeriesCheckboxes:bookSerCheckbox) {
			String checkBoxText= bookSeriesCheckboxes.getText();
			if (checkBoxText.equals("Unofficial Cookbook") && !bookSeriesCheckboxes.isSelected() ) {
				bookSeriesCheckboxes.click();
				break;
			}
		}
	
		}
		
		
		
		
		
				
				
	

	}
