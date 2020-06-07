package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementIsClickable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		String url="https://the-internet.herokuapp.com/";
		driver.get(url);
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//li/a"));
		for (WebElement title:list) {
			String text= title.getAttribute("href");
			System.out.println(text);
			
			if(text.contains("dynamic_controls")) {
				title.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("message")).getText());
		
	}
}
