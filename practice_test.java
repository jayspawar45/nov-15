package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr1=new ChromeDriver();
		dr1.get("https://practicetestautomation.com/practice-test-login/");
		dr1.manage().window().maximize();
		//dr1.findElement(By.id("username")).sendKeys("123456");
		dr1.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		dr1.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		dr1.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		dr1.findElement(By.id("Username")).sendKeys("student");
		Thread.sleep(2000);
		dr1.findElement(By.id("password")).sendKeys("Password123");
		dr1.findElement(By.id("submit")).click();
		//dr1.close();
	}

}
