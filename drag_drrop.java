package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drrop {
public static void main(String[] args) {
	WebDriver w=new ChromeDriver();
	w.get("https://demo.automationtesting.in/Static.html");
	WebElement wb1=w.findElement(By.id("angular"));
	WebElement wb2=w.findElement(By.id("mongo"));
	WebElement wb3=w.findElement(By.id("node"));
	WebElement wb4=w.findElement(By.id("droparea"));
	Actions a1=new Actions(w);
	
	a1.dragAndDrop(wb1,wb4).build().perform();
	a1.dragAndDrop(wb2, wb4).build().perform();
	a1.dragAndDrop(wb3, wb4).build().perform();
	
	
	}
}
