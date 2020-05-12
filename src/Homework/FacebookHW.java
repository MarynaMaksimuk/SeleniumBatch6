package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHW {
	static WebDriver driver;
	
	public static void selectDD(String xPath, String value) {
		List<WebElement>element=driver.findElements(By.xpath(xPath));
		int DDsize= element.size();
		
		for (int i=0; i<DDsize; i++) {
			String actualText= element.get(i).getText();
			if(actualText.equals(value)) {
				element.get(i).click();
				break;
			}
		}
	}public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Marfa");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.name("reg_email__")).sendKeys("212-444-6666");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test");
		
		selectDD("//select[@id='month']//option", "Apr");
		selectDD("//select[@id='day']//option", "24");
		selectDD("//select[@id='year']//option", "1982");
		
		boolean femaleRadio= driver.findElement(By.id("u_0_6")).isEnabled();
		if(femaleRadio) {
			driver.findElement(By.className("_8esa")).click();
			
		}
		driver.findElement(By.xpath("//button[@name='websubmit']")).submit();
		Thread.sleep(2000);
		driver.quit();
	}
}
