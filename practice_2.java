package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr1=new ChromeDriver();
		dr1.get("https://practicetestautomation.com/practice-test-login/");
		dr1.manage().window().maximize();
		WebElement w=dr1.findElement(By.id("username"));
		//w.click();
		//w.sendKeys("sdfds");
		//w.clear();
		w.sendKeys("123student");
		//String d=w.getAttribute("value");
//		System.out.println(d);
//		System.out.println(w.isEnabled());
//		System.out.println(w.isDisplayed());
//		System.out.println(w.isSelected());
//		System.out.println(w.getLocation());
//		System.out.println(w.getSize());
//		System.out.println(w.getTagName());
//		System.out.println(w.getText());
		
		
		WebElement e=dr1.findElement(By.id("password"));
		e.sendKeys("1234343");
		dr1.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		WebElement r=dr1.findElement(By.id("error"));
		System.out.println(r.getText());
		
		
		WebElement x=dr1.findElement(By.id("username"));
		x.sendKeys("student");
		WebElement e1=dr1.findElement(By.id("password"));
		e1.sendKeys("1234343");
		dr1.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		WebElement r1=dr1.findElement(By.id("error"));
		System.out.println(r1.getText());
	}

}
