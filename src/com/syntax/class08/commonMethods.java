package com.syntax.class08;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synatx.utilPackage.BaseClass;
import com.synatx.utilPackage.Constants;

public class commonMethods extends BaseClass {

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * this method check if Radio/checkbox is enabled and clicks it
	 * 
	 * @param radioOrCheckbox
	 * @param value
	 */
	public static void clickRadioorCheckbox(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for (WebElement el : radioOrCheckbox) {
			actualValue = el.getAttribute("value").trim();
			if (actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

	/**
	 * this method selects DD option by visible Text
	 * 
	 * @param element
	 * @param text
	 */
	public static void selectDDvalue(WebElement element, String text) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement el : options) {
				if (el.getText().equals(text)) {
					select.selectByVisibleText(text);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method select DD using index
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDDvalue(WebElement element, int index) {
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method accepts alert
	 * 
	 */
	public static void acceptAlert() {
		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static String getAlertText() {
		String alertText = "";
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();

		}
		return alertText;

	}

	public static void switchToFrame(String nameorId) {
		try {
			driver.switchTo().frame(nameorId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method switches to frame by index
	 * 
	 * @param index
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	/**
	 * explicit wait time
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}

	public static void waitForClickable(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitForClickable(element);
		element.click();
	}
	/**
	 * this method will select a date from a calendar
	 * @param element
	 * @param text
	 */
	public static void selectCalendarDate(List<WebElement> element, String text) {
		for (WebElement pickDate : element) {
			if (pickDate.isEnabled()) {
				if (pickDate.getText().equals(text)) {
					pickDate.click();
					break;
				}
			}
		}
	}
}