package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https:www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		w.manage().window().maximize();
		WebElement wb=w.findElement(By.id("name"));
		wb.sendKeys("Jay Pawar");
		WebElement wb1=w.findElement(By.id("email"));
		wb1.sendKeys("jayspawar45@gmail.com");
		w.findElement(By.xpath("//input[@id='name']//following::input[2]")).click();
		WebElement wb2=w.findElement(By.id("mobile"));
		wb2.sendKeys("23852987855");
		WebElement wb3=w.findElement(By.id("dob"));
		wb3.sendKeys("02-12-2003");
		WebElement wb4=w.findElement(By.id("subjects"));
		wb4.sendKeys("Testing");
		w.findElement(By.xpath("//input[@id='name']//following::input[8]")).click();
		w.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("MET Nashik");;
		WebElement state=w.findElement(By.xpath("//select[@id='state']"));
		Select sr=new Select(state);
		sr.selectByIndex(3);
		System.out.println(state.getText());
		WebElement city=w.findElement(By.xpath("//select[@id='city']"));
		Select sr1=new Select(city);
		sr1.selectByIndex(2);
		System.out.println(city.getText());
		w.findElement(By.name("picture")).sendKeys("C:\\Users\\CDAC\\Pictures\\Screenshots");
		w.findElement(By.xpath("//input[@id='name']//following::input[12]")).click();
		w.findElement(By.xpath("//a[@href = 'login.php']")).click();
		
		Thread.sleep(400000);
		w.close();
	}

}
