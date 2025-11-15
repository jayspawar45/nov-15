package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hub 
{
	public static void main(String[] args) 
	{
		WebDriver w = new ChromeDriver()		;
		w.get("https://accounts.saucelabs.com/am/XUI/#login/");
		System.out.println(w.getTitle());
		WebElement e = w.findElement(By.id("idToken1"));
		Actions a = new Actions(w);
		a.moveToElement(e).contextClick().build().perform();
		e.sendKeys("jay pawar");
		a.doubleClick(e).doubleClick(e).build().perform();
	}
}
