package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMtask2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		String message= driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(message);
		if(message.equals("Password cannot be empty")) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println("No error message displayed");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
