package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		String p=w.getWindowHandle();
		w.get("https://www.google.com");
		w.switchTo().newWindow(WindowType.TAB);
		String c=w.getWindowHandle();
		w.get("https://www.gmail.com");
		w.switchTo().newWindow(WindowType.TAB);
		String g=w.getWindowHandle();
		w.get("https://www.youtube.com");
		Thread.sleep(2000);
		w.switchTo().window(c);
		Thread.sleep(2000);
		w.switchTo().window(p);
		Thread.sleep(2000);
		w.switchTo().window(g);
		Thread.sleep(2000);
		w.close();
		w.quit();
		
		
		
	}

}
