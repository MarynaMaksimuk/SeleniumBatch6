package selenimReview;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class08.commonMethods;



public class calendar extends commonMethods {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="https://jqueryui.com/";
		driver.get(url);
		WebElement datePickerLink= driver.findElement(By.xpath("//a[text()='Datepicker']"));
		datePickerLink.click();
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		
		while(true) {
			String dateText=driver.findElement(By.className("ui-datepicker-title")).getText();
			String deparMonth="August 2020";
			WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
			if(!dateText.equals(deparMonth)) {
				nextButton.click();
			}else {
				break;
			}
			
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		selectCalendarDate(dates, "20");
		driver.switchTo().defaultContent();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(pic, new File ("ScreenShots/HRMS/calendar.png"));
		
		driver.quit();
	}

}
