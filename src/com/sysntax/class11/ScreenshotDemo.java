package com.sysntax.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.synatx.utilPackage.BaseClass;
import com.synatx.utilPackage.ConfigsReader;

public class ScreenshotDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		setUp();

		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getPropery("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(ConfigsReader.getPropery("password"));

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourceFile, new File("ScreenShots/HRMS/dashboard.png"));
		
	}
}
