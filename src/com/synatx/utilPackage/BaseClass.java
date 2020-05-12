package com.synatx.utilPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver setUp() {
		
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(ConfigsReader.getPropery("browser".toLowerCase())) {
			case"chrome":
				System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
				driver=new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",Constants.GECKODRIVER_PATH);
				driver=new FirefoxDriver();
				break;
			default:
				throw new RuntimeException("Browser is not found");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getPropery("url"));
		return driver;
		
		
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
