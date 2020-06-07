package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitReview {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url="https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html";
		driver.get(url);
		
		driver.manage().window().maximize();
		WebElement startDownloadButton= driver.findElement(By.id("downloadButton"));
		startDownloadButton.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
		WebElement completeDriver= driver.findElement(By.xpath("//div[text()='Complete!']"));
		String completeStatusText= completeDriver.getText();
		System.out.println(completeStatusText);
		WebElement closeButton= driver.findElement(By.xpath("//button[text()='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		closeButton.click();
	}

}
