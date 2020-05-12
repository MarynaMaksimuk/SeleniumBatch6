package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement reg= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		reg.click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Marina");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("212-456-7890");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 test street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("10001");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='register']")).submit();
	}

}
