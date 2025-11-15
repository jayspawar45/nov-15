package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ass {
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement d=w.findElement(By.id("fourth"));
		WebElement f= w.findElement(By.id("amt7"));
		Actions s= new Actions(w);
		
		Actions a1=new Actions(w);
		a1.dragAndDrop(d, f).build().perform();
		WebElement d1=w.findElement(By.id("credit2"));
		WebElement f1= w.findElement(By.id("bank"));
		a1.dragAndDrop(d1, f1).build().perform();
	}

}







