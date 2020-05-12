package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMtask1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@name='Submit']")).submit();
		
		boolean LogoPresent =  driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")).isDisplayed();
		System.out.println("Logo is present: "+LogoPresent);
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}
}
