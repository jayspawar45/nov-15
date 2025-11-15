package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_3 {

	public static void main(String[] args) {
		WebDriver dr1=new ChromeDriver();
		dr1.get("https://practicetestautomation.com/practice-test-login/");
		dr1.manage().window().maximize();
		

	}

}
