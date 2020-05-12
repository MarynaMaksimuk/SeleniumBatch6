package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMtask3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(1) > a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Simple')]")).click();
		List <WebElement> list=driver.findElements(By.tagName("input"));
		for (WebElement x:list) {
			x.sendKeys("Hello");
			
			}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
