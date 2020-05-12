package conm.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synatx.utilPackage.BaseClass;

public class FrameRecap {
	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.setUp();
		
		boolean isHomeDisplayed= driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		System.out.println("Is Home Link Displayed "+isHomeDisplayed);
		driver.switchTo().frame("FrameOne");
		
		
		
		
	}

}
