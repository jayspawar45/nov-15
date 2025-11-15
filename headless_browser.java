package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class headless_browser {

	public static void main(String[] args) {
		ChromeOptions cc=new ChromeOptions();
		cc.addArguments("incognito");
		WebDriver w=new ChromeDriver(cc);
		w.get("https://www.google.com");
		System.out.println(w.getTitle());
		//WebElement e=w.findElement(By.id(null))

	}

}
