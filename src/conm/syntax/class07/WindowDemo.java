package conm.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String signUpTitle= driver.getTitle();
		System.out.println(signUpTitle);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		/*
		 * to get hand of window : 
		 * 1. getWindowHandle();
		 * 2.getWindowHandles();
		 */
		Set<String>allWindowHandles= driver.getWindowHandles();
		System.out.println("Number of windows opened are "+allWindowHandles.size());
		Iterator <String>it=allWindowHandles.iterator();
		String mainWindowHandle= it.next();
		System.out.println(mainWindowHandle);
		String childWindowHandle=it.next();
		System.out.println(childWindowHandle);
		driver.switchTo().window(childWindowHandle);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
