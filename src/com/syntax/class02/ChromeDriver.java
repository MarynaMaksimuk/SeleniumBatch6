package com.syntax.class02;

import org.openqa.selenium.By;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.err.println("Opening Chrome Browser...");
	}

	@Override
	public void get(String url) {
	System.out.println("Lunchung the url ::"+url);
		
	}

	@Override
	public String getCurrantUrl() {
	
		return "retriving currant Url";
		
	}

	@Override
	public void close() {
		System.out.println("Closing currant window...");
		
	}

	@Override
	public String getTitle() {
		return null;
		
		
	}

	@Override
	public Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
