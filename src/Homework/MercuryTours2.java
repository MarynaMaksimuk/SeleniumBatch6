package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Marina");
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("Cohen");
		driver.findElement(By.cssSelector("input[name=phone]")).sendKeys("347-123-2345");
		driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("666@gmail.com");
		driver.findElement(By.cssSelector("input[name=address1]")).sendKeys("543 test ave");
		driver.findElement(By.cssSelector("input[name=city]")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[name=state]")).sendKeys("NY");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("testTask");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("98765");
		driver.findElement(By.cssSelector("input[name=confirmPassword]")).sendKeys("98765");
		driver.findElement(By.cssSelector("input[name=register]")).submit();
		
		
	}

}
