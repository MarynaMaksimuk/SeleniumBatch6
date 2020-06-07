package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.synatx.utilPackage.BaseClass;

public class Calendar extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.delta.com/";
		driver.get(url);
		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
		String dMonth= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while(!dMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			dMonth= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
			
			
		}
		List <WebElement> cells= driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		for (WebElement fromCell:cells) {
			String fromText= fromCell.getText();
			if(fromText.equals("15")) {
				fromCell.click();
				break;
			}
		}
		String rMonth= driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		while (!rMonth.equals("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			rMonth=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']")).getText();
		}
		List<WebElement>returnCells= driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
		for(WebElement returnCell:returnCells) {
			if(returnCell.equals("9")) {
				returnCell.click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[@class='donebutton']")).click();
		Thread.sleep(2000);
		tearDown();
}
}