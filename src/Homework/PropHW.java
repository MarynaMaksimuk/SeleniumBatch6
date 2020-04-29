package Homework;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropHW {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		prop.setProperty("browser","GoogleChrome");
		prop.setProperty("url","https://www.expedia.com/");
		prop.setProperty("userName","space123");
		prop.setProperty("password","99999");
		
		FileWriter writer=new FileWriter("propHW.properties");
		prop.store(writer, "Created properties file");
		writer.close();
		String filePath="C:\\Users\\Maksimaryna\\eclipse-workspace\\SeleniumJavaBatch6\\propHW.properties";
		FileInputStream fis=new FileInputStream(filePath);
		prop.load(fis);
		
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("header-account-menu")).click();
		driver.findElement(By.id("account-signin")).click();
		driver.findElement(By.id("gss-signin-email")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id("gss-signin-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("gss-signin-submit")).click();
		
		
		
	}

}
