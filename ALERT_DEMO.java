package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_DEMO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https://demo.automationtesting.in/Alerts.html");
		w.manage().window().maximize();
		w.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		Alert a=w.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		w.findElement(By.xpath("//a[@href = '#CancelTab']")).click();
		w.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Alert a1=w.switchTo().alert();
		System.out.println(a1.getText());
		a1.dismiss();
		System.out.println(w.findElement(By.id("demo")).getText());
	}

}
