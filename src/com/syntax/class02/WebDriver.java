package com.syntax.class02;

import org.openqa.selenium.By;

public interface WebDriver {
	public void get(String url);
	
	public String getCurrantUrl();
	
	public void close();
	
	public String getTitle();

	public Object navigate();

	public Object findElement(By name);

}
