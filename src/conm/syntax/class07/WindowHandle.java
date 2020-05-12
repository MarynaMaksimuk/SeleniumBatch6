package conm.syntax.class07;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String sighUpTitle=driver.getTitle();
		System.out.println("Main page title is "+sighUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is parent window handle? "+parentWindowHandle);
		
		for (int i=0; i<3;i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
		}Set <String> allWindows=driver.getWindowHandles();
		
		for (String handle:allWindows) {
			System.out.println("ID of the window "+handle);
			driver.switchTo().window(handle);
			driver.get("https://www.google.com/");
			//Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		
		}
		driver.quit();
		
	}

}
