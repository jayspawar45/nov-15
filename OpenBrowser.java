package com.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr1=new ChromeDriver();
		//WebDriver dr2=new FirefoxDriver();
		//WebDriver dr3=new EdgeDriver();
		//WebDriver dr4=new SafariDriver();
		dr1.get("https://www.google.com/");
		//dr1.get("https://www.gmail.com/");
//		dr1.manage().window().maximize();
//		dr2.manage().window().minimize();
//		try {
//		Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread.sleep(4000);
		//dr1.navigate().back();
		//Thread.sleep(4000);
		//dr1.navigate().forward();
		//Thread.sleep(4000);
		Dimension d=new Dimension(500, 850);
		dr1.manage().window().setSize(d);
		Thread.sleep(4000);
		//dr1.navigate().forward();
//		System.out.println(dr1.getTitle());
//		System.out.println(dr2.getCurrentUrl());
//	System.out.println(dr1.getTitle().equalsIgnoreCase(dr2.getCurrentUrl()));
//	
		dr1.close();
		//dr2.close();
}
}