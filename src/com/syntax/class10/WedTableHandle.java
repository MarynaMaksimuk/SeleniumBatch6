package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedTableHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://testingpool.com/data-types-in-java/";
		driver.get(url);

		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr"));
		int rowNums = rows.size();
		System.out.println("Total row number is  " + rowNums);

		List<WebElement> cols = driver
				.findElements(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr[1]/td"));
		int numCols = cols.size();
		System.out.println("Total number of cols is " + numCols);

		for (int i = 1; i <= rowNums; i++) {
			for (int j = 1; j <= numCols; j++) {
				WebElement cellData = driver
						.findElement(By.xpath("//div[@class='su-table su-table-alternate']/table/tbody/tr["+i+"]/td["+j+"]"));
				String text=cellData.getText();
			//	System.out.println(text);
				if (j==2) {
					System.out.println(cellData.getText());
				}
			}
		}
	}

}
