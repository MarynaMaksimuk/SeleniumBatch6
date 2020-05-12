package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMtask4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")).click();
		WebElement button= driver.findElement(By.xpath("//input[@type='radio' and @value='Female']"));
		button.click();
		boolean selected=button.isSelected();
		
		String a= driver.findElement(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(3)")).getText();
		if(a.equals("Female")) {
			System.out.println("Correct gender button selected");
		}else {
			System.out.println("Wrong gender button");
		}
		WebElement but=driver.findElement(By.xpath("//input[@type='radio' and @value='15 - 50']"));
		but.click();
		String b=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]")).getText();
		if(b.equals("15 to 50")) {
			System.out.println("Correct age button selected");
		}else {
			System.out.println("Wrong age button");
		}Thread.sleep(3000);
		
		driver.quit();


	
		
	}

}
