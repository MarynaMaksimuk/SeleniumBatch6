package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTaskAA {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.aa.com/homePage.do";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("AID", Keys.TAB);
		// enum
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).clear();
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("JFK");

		driver.findElement(By.id("aa-leavingOn")).click();
		
		Thread.sleep(5000);
		// String dMonth =
		// driver.findElement(By.className("ui-datepicker-month")).getText();
		boolean flag = false;

		while (!flag) {
			String dMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			if (dMonth.equals("July 2020")) {
				List<WebElement> dCells = driver.findElements(
						By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
				for (WebElement cell : dCells) {
					String celltext = cell.getText();
					if (celltext.equals("14")) {
						cell.click();
						flag = true;
						break;

					}
				}
			} else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			Thread.sleep(200);
		}
		driver.findElement(By.id("aa-returningFrom")).click();
		flag=false;
		while (!flag) {
		String rMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		if (rMonth.equals("September 2020")) {
			List<WebElement> retCells = driver.findElements(
					By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
			for (WebElement returnCell:retCells) {
				String returnText=returnCell.getText();
				if (returnText.equals("8")) {
					returnCell.click();
					flag=true;
					break;
				}
			}
		} 
		}}

	}

